package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.service.BlogService;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("list")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    public ModelAndView list(@RequestParam(name = "search") Optional<String> search,Pageable pageable, Model model){
        model.addAttribute("categorys",categoryService.findAll());
        if (search.isPresent()){
            return new ModelAndView("list","blogs",blogService.findAllByNameBlogContaining(search.get(), pageable));
        }
        return new ModelAndView("list","blogs",blogService.findAll(pageable));
    }
    @GetMapping("/create")
    public ModelAndView create(Model model){
        model.addAttribute("categorys",categoryService.findAll());
        return new ModelAndView("create","blog", new Blog());
    }
    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog, RedirectAttributes redirect){
        blogService.saveBlog(blog);
        redirect.addFlashAttribute("message","Create Success");
        return "redirect:/list";
    }
    @GetMapping("/{id}/view")
    public ModelAndView view(@PathVariable Long id){
        return new ModelAndView("view","blog",blogService.findBlogById(id));
    }
    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable Long id, Model model){
        model.addAttribute("categorys",categoryService.findAll());
        return new ModelAndView("edit","blog",blogService.findBlogById(id));
    }
    @PostMapping("/edit")
    public String update(@ModelAttribute Blog blog, RedirectAttributes redirect){
        blogService.saveBlog(blog);
        redirect.addFlashAttribute("message","Update Success");
        return "redirect:/list";
    }
    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable Long id){
        return new ModelAndView("delete","blog",blogService.findBlogById(id));
    }
    @PostMapping("/delete")
    public String remove( Blog blog, RedirectAttributes redirect){
        blogService.deleteBlog(blog.getId());
        redirect.addFlashAttribute("message","Delete Success");
        return "redirect:/list";
    }
}
