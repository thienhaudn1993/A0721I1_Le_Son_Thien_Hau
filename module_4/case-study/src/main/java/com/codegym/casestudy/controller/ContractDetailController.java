package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.ContractDetail;
import com.codegym.casestudy.service.IAttachServiceOfService;
import com.codegym.casestudy.service.IContractDetailService;
import com.codegym.casestudy.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("contract-detail")
public class ContractDetailController {
    @Autowired
    IContractDetailService contractDetailService;
    @Autowired
    IContractService contractService;
    @Autowired
    IAttachServiceOfService attachServiceOfService;

    @GetMapping("")
    public ModelAndView view(Pageable pageable) {
        return new ModelAndView("contractDetail/view", "contractdetails", contractDetailService.findAllContractDetail(pageable));
    }

    @GetMapping("/create")
    public ModelAndView create(Model model, Pageable pageable) {
        model.addAttribute("contractServices", contractService.findAllContract(pageable));
        model.addAttribute("attachservices", attachServiceOfService.findAllAttachService());
        return new ModelAndView("contractDetail/create", "contractdetail", new ContractDetail());
    }

    @PostMapping("/update")
    public String createContractDetail(@Validated @ModelAttribute ContractDetail contractdetail, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model, Pageable pageable) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("contractServices", contractService.findAllContract(pageable));
            model.addAttribute("attachservices", attachServiceOfService.findAllAttachService());
            return "contractDetail/create";
        }
        contractDetailService.saveContractDetail(contractdetail);
        redirectAttributes.addFlashAttribute("message", "Create Contract Detail Success");
        return "redirect:/contract-detail";
    }

}
