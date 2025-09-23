package com.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    record Order(int id, String product, int quantity) {}

    @GetMapping
    public List<Order> getOrders() {
        return List.of(new Order(1, "Book", 2), new Order(2, "Pen", 5));
    }
}