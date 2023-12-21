package com.example.rpmsdomaintest.domain.demand;

import com.example.rpmsdomaintest.domain.resource.Resource;
import jakarta.persistence.*;

import java.time.LocalDateTime;

//수요조사-노후장비 확정 테이블
@Entity
@Table(name = "SPANUAT_RESRCE_CFMTN")
public class SuperannuationResourceConfirmation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SPANUAT_RESRCE_CFMTN_ID")
    private Long id;


    //등록일
    @Column(name = "REG_DT")
    private LocalDateTime registDate;

    //등록자
    @Column(name = "REG_USR")
    private String registUser;

    //수요조사 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DMAND_INVS_ID")
    private DemandInvestigation demandInvestigation;

    //자원 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESRCE_ID")
    private Resource resource;

}
