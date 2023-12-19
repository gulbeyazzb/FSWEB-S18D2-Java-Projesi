package com.workintech.day2.dao;

import com.workintech.day2.entity.Fruit;
import com.workintech.day2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable,Long> {

    @Query(value = "SELECT v.id,v.name,v.price,v.is_grown_tree FROM fsweb.vegetable as v ORDER BY v.price desc",nativeQuery = true)
    List<Vegetable> orderByPriceDesc();

    @Query(value = "SELECT v.id,v.name,v.price,v.is_grown_tree FROM fsweb.vegetable as v ORDER BY v.price ASC",nativeQuery = true)
    List<Vegetable> orderByPriceAsc();

    @Query("SELECT v FROM vegetable v WHERE ILIKE %:name%")
    List<Vegetable> searchByName(String name);

}
