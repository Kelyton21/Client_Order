package com.devsuperior.domain;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.domain.entities.Client;
import com.devsuperior.domain.entities.Order;
import com.devsuperior.domain.entities.OrderItem;
import com.devsuperior.domain.entities.OrderStatus;
import com.devsuperior.domain.entities.Product;
import com.devsuperior.domain.repositories.ClientRepository;
import com.devsuperior.domain.repositories.OrderItemRepository;
import com.devsuperior.domain.repositories.OrderRepository;
import com.devsuperior.domain.repositories.ProductRepository;

@SpringBootApplication
public class DomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomainApplication.class, args);
	}

}
