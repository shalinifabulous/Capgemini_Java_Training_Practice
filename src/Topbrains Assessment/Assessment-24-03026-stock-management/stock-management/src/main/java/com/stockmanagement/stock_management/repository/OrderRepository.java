package com.stockmanagement.stock_management.repository;

import com.stockmanagement.stock_management.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository<Order> extends JpaRepository<Order, Integer> {
}