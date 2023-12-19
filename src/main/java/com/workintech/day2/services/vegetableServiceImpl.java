package com.workintech.day2.services;

import com.workintech.day2.dao.VegetableRepository;
import com.workintech.day2.entity.Vegetable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class vegetableServiceImpl implements vegetableService{
    private final VegetableRepository vegetableRepository;

    public vegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public List<Vegetable> orderByPriceDesc() {
        return vegetableRepository.orderByPriceDesc();
    }

    @Override
    public List<Vegetable> orderByPriceAsc() {
        return vegetableRepository.orderByPriceAsc();
    }

    @Override
    public List<Vegetable> searchByName(String name) {
        return vegetableRepository.searchByName(name);
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public Vegetable delete(long id) {
        Vegetable vegetable=getById(id);
        vegetableRepository.delete(vegetable);
        return vegetable;
    }

    @Override
    public Vegetable getById(long id) {
        Optional<Vegetable> optionalVegetable=vegetableRepository.findById(id);
        if(optionalVegetable.isPresent()){
            return optionalVegetable.get();
        }
        return null;
        //throw
    }
}
