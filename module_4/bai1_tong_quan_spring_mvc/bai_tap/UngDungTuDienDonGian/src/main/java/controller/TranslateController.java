package controller;

import model.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ITranslateService;
import service.Impl.TranslateServiceImpl;

import java.util.List;

@Controller
public class TranslateController {
    ITranslateService iTranslateService = new TranslateServiceImpl();

    @GetMapping("/home")
    public String show() {
        return "list";
    }

    @PostMapping("/home")
    public String translate(@RequestParam("english") String english, Model model) {
        List<Dictionary> dictionaryList = iTranslateService.findAll();
        for (int i = 0; i < dictionaryList.size(); i++) {
            if (english.equals(dictionaryList.get(i).getEnglish())) {
                model.addAttribute("result", dictionaryList.get(i).getVietnamese());
                return "/list";
            } else {
                model.addAttribute("message", "không có trong từ điển");
            }
        }
        return "/list";
    }
}
