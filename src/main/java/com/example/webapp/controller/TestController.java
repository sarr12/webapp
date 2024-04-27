package com.example.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private String context = "";
    @GetMapping("/test")
    public String test() {
        return context;
    }

    @GetMapping("/update")
    public String update(String s) {
        context = s;
        return context;
    }
}
