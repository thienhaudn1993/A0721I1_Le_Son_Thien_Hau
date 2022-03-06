package com.codegym.customer_managerment.controller;

import com.codegym.customer_managerment.model.Province;
import com.codegym.customer_managerment.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProvinceController {

    @Autowired
    ProvinceService provinceService;

    @GetMapping("/provinces")
    public String getListProvinces(Model model){
        Province province = provinceService.findProvinceById(1L);
        return "province";
    }
}
