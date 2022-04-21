package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    public ModelAndView list() {
        return new ModelAndView("/category/list", "categorys", categoryService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("/category/create", "category", new Category());
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Category category, RedirectAttributes redirect) {
        categoryService.saveCategory(category);
        redirect.addFlashAttribute("message", "Create Success");
        return "redirect:/category";
    }

    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable Long id) {
        return new ModelAndView("/category/edit", "category", categoryService.findCategoryById(id));
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Category category, RedirectAttributes redirect) {
        categoryService.saveCategory(category);
        redirect.addFlashAttribute("message", "Update Success");
        return "redirect:/category";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable Long id) {
        return new ModelAndView("/category/delete", "category", categoryService.findCategoryById(id));
    }

    @PostMapping("/delete")
    public String remove(Category category, RedirectAttributes redirect) {
        categoryService.deleteCategory(category.getId());
        redirect.addFlashAttribute("message", "Delete Success");
        return "redirect:/category";
    }
}
