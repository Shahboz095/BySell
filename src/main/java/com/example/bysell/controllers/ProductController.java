package com.example.bysell.controllers;

import com.example.bysell.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/v1/")
@Controller
public class ProductController {
    //
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("products")
    public String products() {
        return "products";
    }

}
