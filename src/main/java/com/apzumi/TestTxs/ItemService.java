package com.apzumi.TestTxs;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ItemService {
    void doA();
    @Transactional(propagation = Propagation.MANDATORY)
    void doB();
    List<Item> findAll();
}
