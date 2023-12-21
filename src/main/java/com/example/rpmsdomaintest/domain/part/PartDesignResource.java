package com.example.rpmsdomaintest.domain.part;

import com.example.rpmsdomaintest.domain.demand.DemandInvestigation;
import com.example.rpmsdomaintest.domain.demand.resource.DemandInvestigationResource;
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

    //자원 타입
    @Column(name = "RESRCE_TY")
    private String resourceType;

    //버전
    @Column(name = "VER")
    private String version;

    @Column(name = "DEL_YN")
    private String delYn;

    @Column(name = "MDFCN_RQST_YN")
    private String modificationRequestYn;

    // 수요조사 매핑
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "DMAND_INVS_ID")
    private DemandInvestigation demandInvestigation;

    // 신규자원 매핑

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "DMAND_INVS_RESRCE_ID")
    private DemandInvestigationResource demandInvestigationResource;
}
