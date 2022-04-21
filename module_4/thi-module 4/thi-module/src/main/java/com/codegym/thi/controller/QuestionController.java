package com.codegym.thi.controller;

import com.codegym.thi.model.Question;
import com.codegym.thi.service.IQuestionService;
import com.codegym.thi.service.IQuestionTypeService;
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

import javax.validation.Valid;

@Controller
@RequestMapping("question")
public class QuestionController {
    @Autowired
    IQuestionService questionService;
    @Autowired
    IQuestionTypeService questionTypeService;
    @GetMapping("")
    public ModelAndView view(@RequestParam(name = "searchByTitle", required = false, defaultValue = "") String searchByTitle, @PageableDefault(size = 5) Pageable pageable){
        if (searchByTitle !=null) {
            ModelAndView modelAndView = new ModelAndView("question/list");
            modelAndView.addObject("nameE", searchByTitle);
            Page<Question> page = questionService.searchQuestionByTitle(searchByTitle, pageable);
            modelAndView.addObject("questions", page);
            return modelAndView;
        }
        return new ModelAndView("/question/list","questions",questionService.findAll(pageable));
    }
    @GetMapping("/create")
    public ModelAndView create(Model model) {
        model.addAttribute("questionType", questionTypeService.findQuestionTypeByAll());
        return new ModelAndView("/question/create", "question", new Question());
    }
    @PostMapping("/create")
    public String SaveQuestion(@Valid @ModelAttribute(name = "question") Question question, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("questionType", questionTypeService.findQuestionTypeByAll());
            return "/question/create";
        }
        questionService.saveQuestion(question);
        redirectAttributes.addFlashAttribute("message", "Create Success");
        return "redirect:/question";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id, Model model) {
        model.addAttribute("questionType", questionTypeService.findQuestionTypeByAll());
        Question question = questionService.findQuestionById(id);
        questionService.deleteQuestion(question.getId());
        return "redirect:/question";
    }
}
