package com.codegym.blogajax.service;

import com.codegym.blogajax.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category saveCategory(Category category);

    void deleteCategory(Long id);

    Category findCategoryById(Long id);
}
