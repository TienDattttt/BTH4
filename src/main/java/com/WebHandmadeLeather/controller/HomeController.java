package com.WebHandmadeLeather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.WebHandmadeLeather.domain.Product;
import com.WebHandmadeLeather.service.ProductService;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/Home")
    public String home(Model model) {
        List<Product> lstPro = this.productService.findByxuhuong(1);
        List<Product> lstProPhobien = this.productService.findByphobien(1);
        model.addAttribute("listPro", lstPro);
        model.addAttribute("listProPhobien", lstProPhobien);
        return "index";
    }
}
