package com.devsuperior.domain.dto;

import com.devsuperior.domain.entities.OrderItem;
import lombok.Getter;

@Getter
public class OrderItemDTO {
    private String productName;
    private Integer quantity;
    private Double price;

    public OrderItemDTO(OrderItem item) {
        this.productName = item.getProduct().getName();
        this.quantity = item.getQuantity();
        this.price = item.getPrice();
    }
}
