package com.example.thymeleaftour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private static final String appName = "Spring Boot Starter";

    @GetMapping("/")
    public String home(Model model,
                       @RequestParam(value = "name", required = false,
                               defaultValue = "Bor!") String name) {

        model.addAttribute("name", name);
        model.addAttribute("title", appName);
        return "home";

    }
}