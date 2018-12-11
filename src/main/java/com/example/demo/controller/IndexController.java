package com.example.demo.controller;

import com.example.demo.source.Children;
import com.example.demo.source.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/demoView")
public class IndexController {

    @RequestMapping("/Logout")
    public String testThymeleaf(Map<String,Object> map) {
        return "bs-first";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        List<Menu> menus = new ArrayList<>();
        Menu menu = new Menu();
        Children children = new Children();
        children.setUrl("/posy");
        children.setMenuName("posy");
        List<Children> childrens = new ArrayList<>();
        childrens.add(children);
        menu.setChildren(childrens);
        menu.setMenuName("index");
        menus.add(menu);
        model.addAttribute("menus", menus);
        return "index";
    }

}