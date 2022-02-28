package com.codegym.controller;

import com.codegym.model.Song;
import com.codegym.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("home")
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("")
    public ModelAndView index(){
        return new ModelAndView("list","songs",songService.findAll());
    }
    @GetMapping("/create")
    public ModelAndView create(){
        return new ModelAndView("create","song", new Song());
    }
    @PostMapping("/save")
    public String save(Song song, RedirectAttributes redirect){
        songService.save(song);
        redirect.addFlashAttribute("success","Add new song Success");
        return "redirect:/home";
    }
    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable Long id){
        return new ModelAndView("edit","song",songService.findById(id));
    }
    @PostMapping("/update")
    public String update(Song song, RedirectAttributes redirectAttributes){
        songService.save(song);
        redirectAttributes.addFlashAttribute("success","Update success");
        return "redirect:/home";
    }
    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable Long id) {
        return new ModelAndView("delete", "song", songService.findById(id));
    }
    @PostMapping("/delete")
    public String remove(Song song,RedirectAttributes redirectAttributes){
        songService.remove(song.getId());
        redirectAttributes.addFlashAttribute("success","Delete Success");
        return "redirect:/home";
    }
}
