package com.example.rpmsdomaintest.domain.jawon;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("G")
public class Network {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long network_id;

    private String network;
}
