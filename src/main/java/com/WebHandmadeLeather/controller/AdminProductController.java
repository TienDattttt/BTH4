package com.WebHandmadeLeather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.WebHandmadeLeather.domain.Product;
import com.WebHandmadeLeather.service.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public String adminproduct(Model model) {
        List<Product> lstPro = this.productService.getAll();
        model.addAttribute("listPro", lstPro);
        return "admin/product/product";
    }

    @GetMapping("/product-add")
    public String admin_product_add() {
        return "admin/product/add-product";
    }
}
