package com.stockmanagement.stock_management.service;

import com.stockmanagement.stock_management.entity.Product;
import com.stockmanagement.stock_management.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderService {

    private final ProductRepository productRepo;

    public OrderService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public double generateBill(Map<Integer, Integer> cart) {
        double total = 0;

        for (Map.Entry<Integer, Integer> entry : cart.entrySet()) {

            Product product = productRepo.findById(entry.getKey()).orElseThrow();
            int qty = entry.getValue();

            if (product.getQuantity() < qty) {
                throw new RuntimeException("Not enough stock");
            }

            total += product.getPrice() * qty;

            product.setQuantity(product.getQuantity() - qty);
            productRepo.save(product);
        }

        double gst = total * 0.18;
        return total + gst;
    }
}