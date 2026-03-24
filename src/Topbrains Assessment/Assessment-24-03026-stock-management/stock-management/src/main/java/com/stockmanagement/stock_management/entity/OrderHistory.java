package com.stockmanagement.stock_management.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_history_info")
public class OrderHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int orderId;
    private int productId;
}