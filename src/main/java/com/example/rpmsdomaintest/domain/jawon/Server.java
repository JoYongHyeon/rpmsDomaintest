package com.example.rpmsdomaintest.domain.jawon;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("A")
public class Server {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long server_id;

    private String server;
}
