package com.stockmanagement.stock_management.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_info")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double totalPrice;
    private double totalPriceWithGst;

    // Getters & Setters
}