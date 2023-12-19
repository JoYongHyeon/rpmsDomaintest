package com.example.rpmsdomaintest.domain.jawon;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("B")
public class ServerStorage {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long serverStorage_id;

    private String serverStorage;
}
