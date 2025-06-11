package com.example.di.app.springboot_di.services;

import java.util.List;

import com.example.di.app.springboot_di.models.Product;
import com.example.di.app.springboot_di.repositories.ProductRepository;

public class ProductService {
    
    private ProductRepository productRepository = new ProductRepository();

    public List<Product> getAllProducts() {
        //return productRepository.getAllProducts();
        return productRepository.getAllProducts().stream().map(product -> {
            product.setPrice(product.getPrice() * 1.14); // Example: applying a tax of 14%
            return product;
        }).toList();
    }

    public Product getProductById(Long id) {
        return productRepository.getProductById(id);
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    public void updateProduct(Long id, Product updatedProduct) {
        productRepository.updateProduct(id, updatedProduct);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteProduct(id);
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.getProductsByCategory(category);
    }
}
