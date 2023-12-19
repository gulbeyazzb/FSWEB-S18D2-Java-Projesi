package com.workintech.day2.services;

import com.workintech.day2.entity.Fruit;

import java.util.List;

public interface FruitService  {
    Fruit getById(long id);
    Fruit save(Fruit fruit);
    Fruit delete(long id);
    List<Fruit> orderByPriceDesc();
    List<Fruit> orderByPriceAsc();
    List<Fruit> searchByName(String name);
}
