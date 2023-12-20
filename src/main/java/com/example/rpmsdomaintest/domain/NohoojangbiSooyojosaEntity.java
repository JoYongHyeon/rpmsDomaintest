package com.example.rpmsdomaintest.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NohoojangbiSooyojosaEntity {

    @Id
    @GeneratedValue
    @Column(name = "NohoojangbiSooyojosa_id")
    private Long id;

    // 노후장비
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "nohoojangbi_id")
    private SuperannuationResource superannuationResource;
}
