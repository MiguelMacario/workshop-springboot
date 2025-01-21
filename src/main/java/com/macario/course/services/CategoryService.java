package com.macario.course.services;

import com.macario.course.entities.Category;
import com.macario.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(long id) {
       Optional<Category> obj = categoryRepository.findById(id);
       return obj.get();
    }
}
