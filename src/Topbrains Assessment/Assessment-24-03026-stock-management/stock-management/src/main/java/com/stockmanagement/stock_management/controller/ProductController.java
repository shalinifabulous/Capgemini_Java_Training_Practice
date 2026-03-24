package com.stockmanagement.stock_management.controller;

import com.stockmanagement.stock_management.entity.Product;
import com.stockmanagement.stock_management.service.ProductService;
import com.stockmanagement.stock_management.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;
    private final OrderService orderService;

    public ProductController(ProductService service, OrderService orderService) {
        this.service = service;
        this.orderService = orderService;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable int id, @RequestBody Product product) {
        return service.updateProduct(id, product);
    }

    @GetMapping("/search/name")
    public List<Product> searchByName(@RequestParam String name) {
        return service.searchByName(name);
    }

    @PostMapping("/bill")
    public double generateBill(@RequestBody Map<Integer, Integer> cart) {
        return orderService.generateBill(cart);
    }
}