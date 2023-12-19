package com.example.rpmsdomaintest.domain.jawon;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("D")
public class ServerSystem {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long severSystem_id;

    private String serverSystem;
}
