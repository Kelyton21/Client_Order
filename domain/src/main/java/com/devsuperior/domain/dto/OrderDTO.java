package com.devsuperior.domain.dto;

import com.devsuperior.domain.entities.Order;
import lombok.Getter;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class OrderDTO {
    private Long id;
    private Instant moment;
    private String status;
    private ClientDTO client;
    private List<OrderItemDTO> items;

    public OrderDTO(Order order) {
        this.id = order.getId();
        this.moment = order.getMoment();
        this.status = order.getStatus().name();
        this.client = new ClientDTO(order.getClient());
        this.items = order.getItems().stream()
                .map(OrderItemDTO::new)
                .collect(Collectors.toList());
    }
}
