package com.eventdriven.basedomains.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private long orderId;
    private String name;
    private int quantity;
    private double amount;
}
