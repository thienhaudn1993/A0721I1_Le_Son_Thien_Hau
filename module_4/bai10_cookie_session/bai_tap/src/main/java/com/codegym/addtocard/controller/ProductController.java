package com.codegym.addtocard.controller;

import com.codegym.addtocard.model.Cart;
import com.codegym.addtocard.model.Product;
import com.codegym.addtocard.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    IProductService productService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/shop/{id}/view")
    public ModelAndView view(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/view");
        modelAndView.addObject("product", productService.findById(id));
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCard(@PathVariable Long id, @ModelAttribute("cart") Cart cart, @RequestParam("action") String action) {
        Product product = productService.findById(id);
        if (product == null) {
            return "/error";
        }
        if (action.equals("show")) {
            cart.addProduct(product);
            return "redirect:/shopping-cart";
        }
        if (action.equals("list")) {
            cart.addProduct(product);
            return "redirect:/shop/{id}/view ";
        }
        cart.addProduct(product);
        return "redirect:/shop";
    }
}
