package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("list")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("")
    public ModelAndView list() {
        return new ModelAndView("list", "blogs", blogService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("create", "blog", new Blog());
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog, RedirectAttributes redirect) {
        blogService.saveBlog(blog);
        redirect.addFlashAttribute("message", "Create Success");
        return "redirect:/list";
    }

    @GetMapping("/{id}/view")
    public ModelAndView view(@PathVariable Long id) {
        return new ModelAndView("view", "blog", blogService.findBlogById(id));
    }

    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable Long id) {
        return new ModelAndView("edit", "blog", blogService.findBlogById(id));
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Blog blog, RedirectAttributes redirect) {
        blogService.saveBlog(blog);
        redirect.addFlashAttribute("message", "Update Success");
        return "redirect:/list";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable Long id) {
        return new ModelAndView("delete", "blog", blogService.findBlogById(id));
    }

    @PostMapping("/delete")
    public String remove(Blog blog, RedirectAttributes redirect) {
        blogService.deleteBlog(blog.getId());
        redirect.addFlashAttribute("message", "Delete Success");
        return "redirect:/list";
    }
}
