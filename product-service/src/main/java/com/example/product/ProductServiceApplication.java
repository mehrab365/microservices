package com.example.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/products")
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    record Product(int id, String name, double price) {}

    @GetMapping
    public List<Product> getProducts() {
        return List.of(new Product(1, "Laptop", 1200.0), new Product(2, "Phone", 800.0));
    }
}