package com.workintech.day2.controller;


import com.workintech.day2.entity.Fruit;
import com.workintech.day2.services.FruitService;
import com.workintech.day2.services.FruitServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    private FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping("/")
    public List<Fruit> getByPriceAsc(){
        return fruitService.orderByPriceAsc();
    }

    @GetMapping("/{id}")
    public Fruit getById(@PathVariable long id){
        return fruitService.getById(id);
    }

    @GetMapping("/desc")
    public List<Fruit> getByPriceDesc(){
        return fruitService.orderByPriceDesc();
    }

    @PostMapping("/")
    public Fruit save(@RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }

    @PostMapping("/{name}")
    public List<Fruit> getByName(@PathVariable String name){
        return fruitService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable long id){
        return fruitService.delete(id);
    }

}
