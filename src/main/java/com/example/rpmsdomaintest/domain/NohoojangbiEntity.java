package com.example.rpmsdomaintest.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class NohoojangbiEntity {

    @Id
    @GeneratedValue
    @Column(name = "nohoojangbi_id")
    private Long id;

    // 노후장비 수요조사
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "sooyojosa_id")
    private SooyojosaEntity sooyojosaEntity;
}
