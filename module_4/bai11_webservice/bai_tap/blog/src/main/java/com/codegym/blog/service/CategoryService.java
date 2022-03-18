package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    void saveCategory(Category category);

    void deleteCategory(Long id);

    Category findCategoryById(Long id);
}
