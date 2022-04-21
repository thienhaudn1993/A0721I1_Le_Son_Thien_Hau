package com.codegym.blog.service.Impl;

import com.codegym.blog.model.Category;
import com.codegym.blog.repository.CategoryRepository;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category findCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
