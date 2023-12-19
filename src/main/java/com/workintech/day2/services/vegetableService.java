package com.workintech.day2.services;

import com.workintech.day2.entity.Fruit;
import com.workintech.day2.entity.Vegetable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface vegetableService {
    List<Vegetable> orderByPriceDesc();
    List<Vegetable> orderByPriceAsc();
    List<Vegetable> searchByName(String name);

    Vegetable save(Vegetable vegetable);
    Vegetable delete(long id);

    Vegetable getById(long id);

}
