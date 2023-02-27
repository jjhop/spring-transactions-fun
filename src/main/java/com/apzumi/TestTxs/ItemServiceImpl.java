package com.apzumi.TestTxs;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    /**
     * wywołujmey tylkO tę...
     */
    @Override
    public void doA() {
        doB();
    }

    @Override
    public void doB() {
        Item itemA = new Item("Thinking in Java");
        Item itemB = new Item("Elixir in Action");
        itemRepository.save(itemA);
        if (1 == 1) throw new RuntimeException("Przerywamy imprezę!");
        itemRepository.save(itemB);
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }
}
