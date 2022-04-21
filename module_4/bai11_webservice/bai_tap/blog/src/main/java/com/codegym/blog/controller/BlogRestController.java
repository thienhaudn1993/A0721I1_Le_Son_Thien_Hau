package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.service.BlogService;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("list")
public class BlogRestController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    public ResponseEntity<List<Blog>> findAllBlog() {
        List<Blog> blogs = blogService.findAll();
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> findByIdBlog(@PathVariable Long id) {
        Blog blog = blogService.findBlogById(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<List<Blog>> searchByCategoryId(@PathVariable int id) {
//        List<Category> categoryList = categoryService.findAll();
        List<Blog> blogs = blogService.searchByCategoryId(id);
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

}
