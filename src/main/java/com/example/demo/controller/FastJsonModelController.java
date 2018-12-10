package com.example.demo.controller;

import com.example.demo.model.FastJsonModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class FastJsonModelController {
    @GetMapping("/fast-json")
    public FastJsonModel getFastJson() {
        FastJsonModel fastJsonModel = new FastJsonModel();
        fastJsonModel.setId(1);
        fastJsonModel.setString("fastJson test");
        fastJsonModel.setIgnore("ignore ");
        fastJsonModel.setDate(new Date());
        return fastJsonModel;
    }
}
