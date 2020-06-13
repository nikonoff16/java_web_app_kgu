package com.nikonoff.SnilsTool.controller;

import com.nikonoff.SnilsTool.SnilsCheck;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value={"/", "/index"}, method=RequestMethod.GET)
    public String snilsForm(Model model) {
        model.addAttribute("snilscheck", new SnilsCheck());
        return "index";
    }

    @RequestMapping(value={"/", "/index"}, method=RequestMethod.POST)
    public String snilsSubmit(@ModelAttribute SnilsCheck snilscheck, Model model) {
        model.addAttribute("snilscheck", snilscheck);
        return "result";
    }

}
