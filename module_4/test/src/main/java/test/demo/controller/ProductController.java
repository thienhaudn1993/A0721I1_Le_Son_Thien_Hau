package test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import test.demo.model.Product;
import test.demo.service.ICategoryService;
import test.demo.service.IProductService;

import javax.validation.Valid;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    IProductService productService;
    @Autowired
    ICategoryService categoryService;

    @GetMapping("")
    public ModelAndView view(@RequestParam(name = "searchByProductName", required = false, defaultValue = "") String searchByProductName, @PageableDefault(size = 5) Pageable pageable) {
        if (searchByProductName != null) {
            ModelAndView modelAndView = new ModelAndView("product/list");
            modelAndView.addObject("nameE", searchByProductName);
            Page<Product> page = productService.searchProductByName(searchByProductName, pageable);
            modelAndView.addObject("products", page);
            return modelAndView;
        }
        return new ModelAndView("/product/list", "products", productService.findAll(pageable));
    }

    @GetMapping("/create")
    public ModelAndView create(Model model) {
        model.addAttribute("categories", categoryService.findCategoryByAll());
        return new ModelAndView("/product/create", "product", new Product());
    }

    @PostMapping("/create")
    public String SaveProduct(@Valid @ModelAttribute(name = "product") Product product, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("categories", categoryService.findCategoryByAll());
            return "product/create";
        }
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "Create Success");
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable Long id, Model model) {
        model.addAttribute("categories", categoryService.findCategoryByAll());
        Product product = productService.findProductById(id);
        return new ModelAndView("/product/edit", "product", product);
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute Product product, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("categories", categoryService.findCategoryByAll());
            return "product/edit";
        }
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "Update Success");
        return "redirect:/product";
    }

    //    @GetMapping("/{id}/delete")
//    public ModelAndView delete(@PathVariable Long id, Model model){
//        model.addAttribute("categories",categoryService.findCategoryByAll());
//        Product product = productService.findProductById(id);
//        return new ModelAndView("/product/delete","product", product);
//    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id, Model model) {
        model.addAttribute("categories", categoryService.findCategoryByAll());
        Product product = productService.findProductById(id);
        productService.removeProductById(product.getId());
        return "redirect:/product";
    }

//    @PostMapping("/delete")
//    public String delete(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
//        productService.removeProductById(product.getId());
//        redirectAttributes.addFlashAttribute("message","Delete Success");
//        return "redirect:/product";
//    }

}
