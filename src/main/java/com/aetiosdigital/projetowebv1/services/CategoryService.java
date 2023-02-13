package com.aetiosdigital.projetowebv1.services;

import com.aetiosdigital.projetowebv1.entities.Category;
import com.aetiosdigital.projetowebv1.entities.User;
import com.aetiosdigital.projetowebv1.repositories.CategoryRepository;
import com.aetiosdigital.projetowebv1.repositories.UserRepository;
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
