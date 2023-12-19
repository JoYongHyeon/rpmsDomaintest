package com.example.rpmsdomaintest.domain;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class NohoojangbiSooyojosaEntity {

    @Id
    @GeneratedValue
    @Column(name = "NohoojangbiSooyojosa_id")
    private Long id;

    // 노후장비
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "nohoojangbi_id")
    private NohoojangbiEntity nohoojangbiEntity;
}
