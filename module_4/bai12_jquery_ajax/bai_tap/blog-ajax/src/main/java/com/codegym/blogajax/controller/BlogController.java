package com.codegym.blogajax.controller;

import com.codegym.blogajax.dto.BlogDTO;
import com.codegym.blogajax.model.Blog;
import com.codegym.blogajax.service.IBlogService;
import com.codegym.blogajax.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("blog")
public class BlogController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;

    /*@PostMapping
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog){
        return new ResponseEntity<>(blogService.saveBlog(blog), HttpStatus.CREATED);
    }*/
    @GetMapping("/list")
    public ModelAndView getAllBlog(Model model) {
        model.addAttribute("categorys", categoryService.findAll());
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("blogs", blogService.findAll());
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @GetMapping
    public ResponseEntity<List<Blog>> allBlog() {
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BlogDTO> saveBlog(@RequestBody BlogDTO blogDTO) {
        blogService.saveBlogDTO(blogDTO);
        return new ResponseEntity<>(blogDTO, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Blog>> searchBlog(@RequestParam("name") String name) {
        List<Blog> blogs = blogService.searchByNameBlog(name);
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

}
