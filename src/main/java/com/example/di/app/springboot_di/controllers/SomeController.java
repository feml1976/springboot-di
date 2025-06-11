package com.example.di.app.springboot_di.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.di.app.springboot_di.models.Product;
import com.example.di.app.springboot_di.services.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class SomeController {
    
    private final ProductService service = new ProductService(); // Assuming ProductService is defined elsewhere
    @GetMapping
    public List<Product> list(){
        return service.getAllProducts();
    }
    
    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return service.getProductById(id); 
    }
}
