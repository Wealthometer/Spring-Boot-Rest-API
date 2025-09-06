package com.Wealthometer.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Wealth");

        return "index.html";
    }

    @RequestMapping("/h ")
    public String sayHello() {
        return "index.html";
    }
}