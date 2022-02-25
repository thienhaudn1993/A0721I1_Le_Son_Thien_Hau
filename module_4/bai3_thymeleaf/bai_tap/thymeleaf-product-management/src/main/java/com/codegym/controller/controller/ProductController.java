package com.codegym.controller.controller;

import com.codegym.controller.model.Product;
import com.codegym.controller.service.IProductService;
import com.codegym.controller.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private IProductService productService= new ProductService();
    @GetMapping("")
    public String index(Model model){
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirect){
        productService.save(product);
        redirect.addFlashAttribute("message","Add Success");
        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String update(Product product){
        productService.update(product.getId(),product);
        return "redirect:/product";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect){
        productService.remove(product.getId());
        redirect.addFlashAttribute("message","Delete Success");
        return "redirect:/product";
    }
    @GetMapping("/{id}/view")
    public String viewDetail(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "view";
    }
}
