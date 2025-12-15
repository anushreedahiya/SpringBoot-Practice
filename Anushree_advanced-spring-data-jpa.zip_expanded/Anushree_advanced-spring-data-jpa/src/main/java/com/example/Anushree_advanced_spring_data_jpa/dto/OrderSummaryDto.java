package com.example.Anushree_advanced_spring_data_jpa.dto;

import java.math.BigDecimal;

public class OrderSummaryDto {
    private Long orderId;
    private String customerName;
    private BigDecimal totalAmount;

    public OrderSummaryDto(Long orderId, String customerName, BigDecimal totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public Long getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public BigDecimal getTotalAmount() { return totalAmount; }
}
