package com.workintech.day2.dao;

import com.workintech.day2.entity.Fruit;
import org.springframework.core.io.FileUrlResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit,Long> {

    @Query(value = "SELECT f.id,f.name,f.price,f.fruit_type FROM fsweb.fruit as f ORDER BY f.price desc",nativeQuery = true)
     List<Fruit> orderByPriceDesc();

    @Query(value = "SELECT f FROM fsweb.fruit as f ORDER BY f.price ASC",nativeQuery = true)
    List<Fruit> orderByPriceAsc();

    @Query("SELECT f FROM fruit f WHERE ILIKE %:name%")
    List<Fruit> searchByName(String name);
}
