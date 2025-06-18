package com.devsuperior.domain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    public List<Order> findByClientId(Long clientId);
}
