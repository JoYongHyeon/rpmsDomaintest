package com.example.rpmsdomaintest.domain.jawon;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("E")
public class Storage {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long storage_id;

    private String storage;
}
