package com.workintech.day2.services;

import com.workintech.day2.dao.FruitRepository;
import com.workintech.day2.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;

    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public Fruit getById(long id) {
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);

        if (optionalFruit.isPresent()) {
            return optionalFruit.get();
        }
        //TODO[GÜLBEYAZ] THROW EXCEPTİON ATACAK
        return null;
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit delete(long id) {
        Fruit fruit = getById(id);
        fruitRepository.delete(fruit);
        return fruit;
    }

    @Override
    public List<Fruit> orderByPriceDesc() {
        return fruitRepository.orderByPriceDesc();
    }

    @Override
    public List<Fruit> orderByPriceAsc() {
        return fruitRepository.orderByPriceAsc();
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }
}
