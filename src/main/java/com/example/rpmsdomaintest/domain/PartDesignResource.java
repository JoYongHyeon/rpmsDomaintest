package com.example.rpmsdomaintest.domain;

import com.example.rpmsdomaintest.domain.demand.DemandInvestigation;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "PART_DESIGN_RESRCE")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PartDesignResource {

    @Id
    @GeneratedValue
    @Column(name = "PART_DESIGN_RESRCE_ID")
    private Long id;


    // 수요조사
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "DMAND_INVS_ID")
    private DemandInvestigation demandInvestigation;
}
