package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public ModelAndView getListaUtentiView(){
        ModelMap model = new ModelMap();
//        model.addAttribute("name", "Spring Boot");
        return new ModelAndView("index", model);
    }
}
