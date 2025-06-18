package com.devsuperior.domain.dto;

import com.devsuperior.domain.entities.Client;
import lombok.Getter;

@Getter
public class ClientDTO {
    private String name;
    private String email;

    public ClientDTO(Client client) {
        this.name = client.getName();
        this.email = client.getEmail();
    }
}
