package com.example.rpmsdomaintest.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class TonghabsaupEntity {

    @Id
    @GeneratedValue
    @Column(name = "tonghabsaup_id")
    private Long id;

    // 수요조사
    @OneToMany(mappedBy = "tonghabsaupEntity")
    private List<SooyojosaEntity> sooyojosaEntities = new ArrayList<>();
}
