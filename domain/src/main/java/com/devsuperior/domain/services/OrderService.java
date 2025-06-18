package com.devsuperior.domain.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.domain.dto.OrderDTO;
import com.devsuperior.domain.repositories.OrderRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Transactional(readOnly = true)
    public OrderDTO getOrderById(Long id) {
        var orderOpt = orderRepository.findById(id);
        if (orderOpt.isEmpty()) {
            throw new IllegalArgumentException("Pedido não encontrado");
        }
        return new OrderDTO(orderOpt.get());
    }
}
