package com.example.rpmsdomaintest.domain.superannuation;

import com.example.rpmsdomaintest.domain.demand.DemandInvestigation;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SuperannuationResource {

    @Id
    @GeneratedValue
    @Column(name = "SPANUAT_RESRCE_ID")
    private Long id;

    // 노후장비 수요조사
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "DMAND_INVS_ID")
    private DemandInvestigation demandInvestigation;
}
