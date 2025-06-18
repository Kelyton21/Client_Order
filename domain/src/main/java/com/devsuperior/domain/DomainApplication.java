package com.devsuperior.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.domain.entities.Client;
import com.devsuperior.domain.entities.Product;
import com.devsuperior.domain.repositories.ClientRepository;
import com.devsuperior.domain.repositories.ProductRepository;

@SpringBootApplication
public class DomainApplication implements CommandLineRunner{

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(DomainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Client client = new Client(null, "John Doe", "Jong@gmail.com");
		Product product = new Product(null, "Laptop", 1200.00);
		clientRepository.save(client);
		productRepository.save(product);
	}

}
