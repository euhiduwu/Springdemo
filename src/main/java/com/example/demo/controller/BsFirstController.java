package com.example.demo.controller;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BsFirstController {
    private final UserInfoService userInfoService;

    public BsFirstController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("bs-first")
    public String ShowBsFirst(Model model, Integer page, Integer number) {
        List<UserInfo> list = userInfoService.getUserInfo(page, number).getList();
        model.addAttribute("userInfoList",list);
        return "bs-first";
    }
}
