package com.codegym.validationsong.controller;

import com.codegym.validationsong.model.Song;
import com.codegym.validationsong.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/list")
public class SongController {
    @Autowired
    SongService songService;
    @GetMapping("")
    public ModelAndView viewList(){
        return new ModelAndView("index","songs",songService.findAll());
    }
    @GetMapping("/create")
    public ModelAndView create(){
        return new ModelAndView("create","song",new Song());
    }
    @PostMapping("/create")
    public String save(@Valid @ModelAttribute Song song, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasFieldErrors()){
            return "create";
        }else {
            songService.saveSong(song);
            redirectAttributes.addFlashAttribute("message","Create Song Success");
            return "redirect:/list";
        }
    }
    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable Long id, Model model){
        return new ModelAndView("edit","song",songService.findById(id));
    }
    @PostMapping("/edit")
    public String update(@Valid @ModelAttribute Song song, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasFieldErrors()){
            return "edit";
        }else {
            songService.saveSong(song);
            redirectAttributes.addFlashAttribute("message","Update Success");
            return "redirect:/list";
        }
    }
}
