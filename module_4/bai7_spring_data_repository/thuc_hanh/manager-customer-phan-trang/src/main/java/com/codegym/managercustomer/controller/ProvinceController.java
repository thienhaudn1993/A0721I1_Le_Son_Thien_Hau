package com.codegym.managercustomer.controller;

import com.codegym.managercustomer.model.Customer;
import com.codegym.managercustomer.model.Province;
import com.codegym.managercustomer.service.CustomerSerive;
import com.codegym.managercustomer.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/province")
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @GetMapping("")
    public ModelAndView list() {
        return new ModelAndView("/province/list", "provinces", provinceService.findAll());
    }

    @GetMapping("/create-province")
    public ModelAndView create() {
        return new ModelAndView("/province/create", "province", new Province());
    }

    @PostMapping("/create-province")
    public String save(Province province, RedirectAttributes redirect) {
        provinceService.saveProvince(province);
        redirect.addFlashAttribute("message", "Create Success");
        return "redirect:/province";
    }

    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable Long id) {
        return new ModelAndView("/province/edit", "province", provinceService.findProvinceById(id));
    }

    @PostMapping("/edit-province")
    public String update(Province province, RedirectAttributes redirect) {
        provinceService.saveProvince(province);
        redirect.addFlashAttribute("message", "Update Success");
        return "redirect:/province";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable Long id) {
        return new ModelAndView("delete", "province", provinceService.findProvinceById(id));
    }

    @PostMapping("/delete-province")
    public String remove(Province province, RedirectAttributes redirect) {
        provinceService.deleteProvince(province.getId());
        redirect.addFlashAttribute("message", "Delete Success");
        return "redirect:/province";
    }
}
