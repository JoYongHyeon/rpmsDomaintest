package com.example.rpmsdomaintest.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class BooboonEntity {

    @Id
    @GeneratedValue
    @Column(name = "booboon_id")
    private Long id;


    // 수요조사
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "sooyojosa_id")
    private SooyojosaEntity sooyojosaEntity;
}
