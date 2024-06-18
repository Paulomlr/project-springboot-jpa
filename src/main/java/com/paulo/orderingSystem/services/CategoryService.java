package com.paulo.orderingSystem.services;

import com.paulo.orderingSystem.entities.Category;
import com.paulo.orderingSystem.entities.Order;
import com.paulo.orderingSystem.repositories.CategoryRepository;
import com.paulo.orderingSystem.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}