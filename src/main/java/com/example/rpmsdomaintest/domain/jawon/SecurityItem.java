package com.example.rpmsdomaintest.domain.jawon;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("H")
public class SecurityItem {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long security_id;

    private String security;
}
