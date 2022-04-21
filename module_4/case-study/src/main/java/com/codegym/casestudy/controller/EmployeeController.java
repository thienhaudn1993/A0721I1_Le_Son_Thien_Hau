package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.Customer;
import com.codegym.casestudy.model.Employee;
import com.codegym.casestudy.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    IPositionService positionService;
    @Autowired
    IDevisionService devisionService;
    @Autowired
    IEducationDegreeService educationDegreeService;
    @Autowired
    IUserService userService;

    @GetMapping("")
    public ModelAndView listEmployee(@RequestParam(name = "searchByEmployeeName", required = false, defaultValue = "") String searchByEmployeeName, @PageableDefault(size = 2) Pageable pageable) {
        if (searchByEmployeeName != null) {
            ModelAndView modelAndView = new ModelAndView("employee/view");
            modelAndView.addObject("nameE", searchByEmployeeName);
            Page<Employee> page = employeeService.searchEmployeeByName(searchByEmployeeName, pageable);
            modelAndView.addObject("employees", page);
            return modelAndView;
        }
        return new ModelAndView("employee/view", "employees", employeeService.findAll(pageable));

    }

    //    @GetMapping("")
//    public ModelAndView list(@PageableDefault(size = 2) Pageable pageable, @ModelAttribute("searchByEmployeeName") Optional<String> search){
//        if (search.isPresent()){
//            return new ModelAndView("employee/view","employees",employeeService.searchEmployeeByName(search.get(),pageable));
//        }
//        return new ModelAndView("employee/view","employees",employeeService.findAll(pageable));
//    }
    @GetMapping("/create")
    public ModelAndView createEmployee(Model model) {
        model.addAttribute("employeePosition", positionService.findAllPosition());
        model.addAttribute("employeeDevision", devisionService.findAllDevision());
        model.addAttribute("employeeEducationDegree", educationDegreeService.findAll());
        model.addAttribute("employeeUser", userService.findAllUser());
        return new ModelAndView("employee/create", "employee", new Employee());
    }

    @PostMapping("/create")
    public String saveEmployee(@Validated Employee employee, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("employeePosition", positionService.findAllPosition());
            model.addAttribute("employeeDevision", devisionService.findAllDevision());
            model.addAttribute("employeeEducationDegree", educationDegreeService.findAll());
            model.addAttribute("employeeUser", userService.findAllUser());
//            model.addAttribute("employee", new Employee());
            return "employee/create";
        }
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message", "Create Success");
        return "redirect:/employee";
    }

    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable Long id, Model model) {
        model.addAttribute("employeePosition", positionService.findAllPosition());
        model.addAttribute("employeeDevision", devisionService.findAllDevision());
        model.addAttribute("employeeEducationDegree", educationDegreeService.findAll());
        model.addAttribute("employeeUser", userService.findAllUser());
        Employee employee = employeeService.findEmployeeById(id);
        return new ModelAndView("/employee/edit", "employee", employee);
    }

    @PostMapping("/update")
    public String update(@Validated @ModelAttribute Employee employee, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("employeePosition", positionService.findAllPosition());
            model.addAttribute("employeeDevision", devisionService.findAllDevision());
            model.addAttribute("employeeEducationDegree", educationDegreeService.findAll());
            model.addAttribute("employeeUser", userService.findAllUser());
            return "/employee/edit";
        }
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message", "Update Success");
        return "redirect:/employee";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable Long id, Model model) {
        model.addAttribute("employeePosition", positionService.findAllPosition());
        model.addAttribute("employeeDevision", devisionService.findAllDevision());
        model.addAttribute("employeeEducationDegree", educationDegreeService.findAll());
        model.addAttribute("employeeUser", userService.findAllUser());
        Employee employee = employeeService.findEmployeeById(id);
        return new ModelAndView("/employee/delete", "employee", employee);
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes) {
        employeeService.deleteEmployeeById(employee.getEmployee_id());
        redirectAttributes.addFlashAttribute("message", "Delete Success");
        return "redirect:/employee";
    }
}
