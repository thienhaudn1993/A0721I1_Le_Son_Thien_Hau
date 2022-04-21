package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.service.BlogService;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryRestController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    BlogService blogService;

    @GetMapping("")
    public ResponseEntity<List<Category>> finAllCategory() {
        List<Category> categories = categoryService.findAll();
        if (categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findByIdCategory(@PathVariable Long id) {
        Category category = categoryService.findCategoryById(id);
        if (category == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
//            Blog blogList = blogService.findBlogById(id);
            return new ResponseEntity<>(category, HttpStatus.OK);
        }

    }
}
