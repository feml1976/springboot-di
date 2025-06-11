package com.example.di.app.springboot_di.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.di.app.springboot_di.models.Product;

public class ProductRepository {

    List<Product> products = new ArrayList<>();
    public ProductRepository() {
        // Initialize with some dummy data
        products.add(new Product(1L, "Laptop", 1200.34, "High performance laptop", "Electronics"));
        products.add(new Product(2L, "Smartphone", 800.43, "Latest model smartphone", "Electronics"));
        products.add(new Product(3L, "Headphones", 150.70, "Noise-cancelling headphones", "Accessories"));
        products.add(new Product(4L, "Coffee Maker", 100.07, "Automatic coffee maker", "Home Appliances"));
        products.add(new Product(5L, "Blender", 50.14, "High-speed blender", "Home Appliances"));
        products.add(new Product(6L, "Keyboard", 50.41, "Gaming keyboard", "Accessories"));
        products.add(new Product(7L, "Mouse", 20.55, "Gaming mouse", "Accessories"));
        products.add(new Product(8L, "Monitor", 300.30, "4K monitor", "Electronics"));
        products.add(new Product(9L, "Smartwatch", 250.20, "Fitness tracking smartwatch", "Wearables"));
        products.add(new Product(10L, "Tablet", 400.10, "10-inch tablet", "Electronics"));
        products.add(new Product(11L, "Laptop Bag", 100.36, "Comfortable laptop bag", "Accessories"));
        products.add(new Product(12L, "Smartphone Case", 50.63, "Protective case for smartphone", "Accessories"));
        products.add(new Product(13L, "Headphones Case", 30.70, "Protective case for headphones", "Accessories"));
        products.add(new Product(14L, "Coffee Beans", 20.99, "Premium coffee beans", "Groceries"));
        products.add(new Product(15L, "Blender Jar", 15.50, "Replacement jar for blender", "Accessories"));
        products.add(new Product(16L, "Keyboard Cover", 10.45, "Gaming keyboard cover", "Accessories"));
        products.add(new Product(17L, "Mouse Pad", 5.67, "Gaming mouse pad", "Accessories"));
        products.add(new Product(18L, "Monitor Stand", 25.30, "Adjustable monitor stand", "Accessories"));
        products.add(new Product(19L, "Smartwatch Band", 10.20, "Fitness tracking smartwatch band", "Accessories"));
        products.add(new Product(20L, "Tablet Case", 30.15, "Protective case for tablet", "Accessories"));
        products.add(new Product(21L, "Laptop Charger", 10.99, "High-quality laptop charger", "Electronics"));
    }
    public List<Product> getAllProducts() {
        return products;
    }
    public Product getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void updateProduct(Long id, Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.set(i, updatedProduct);
                return;
            }
        }
    }
    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
    public List<Product> getProductsByCategory(String category) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
