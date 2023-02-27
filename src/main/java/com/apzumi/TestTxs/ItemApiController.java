package com.apzumi.TestTxs;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/items")
@RequiredArgsConstructor
@RestController
public class ItemApiController {

    final ItemService itemService;

    @GetMapping("")
    public List<Item> list() {
        Class<?> clazzOfItemService = itemService.getClass();
        System.out.println(clazzOfItemService.getName());
        System.out.println(clazzOfItemService.getSuperclass().getName());
        return itemService.findAll();
    }

    // tak, to jest bardzo złe!
    @GetMapping("/txtest")
    public void doSomethingTransactional() {
        itemService.doA();
    }

}
