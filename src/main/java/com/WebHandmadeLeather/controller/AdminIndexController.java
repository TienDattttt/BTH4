package com.WebHandmadeLeather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminIndexController {
    @GetMapping("/Home")
    public String adminIndex() {
        return "admin/index";
    }
}
