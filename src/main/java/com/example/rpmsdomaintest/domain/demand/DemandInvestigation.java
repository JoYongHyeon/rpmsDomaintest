package com.example.rpmsdomaintest.domain.demand;

import com.example.rpmsdomaintest.domain.part.PartDesignResource;
import com.example.rpmsdomaintest.domain.unity.UnityBusiness;
import com.example.rpmsdomaintest.domain.demand.resource.DemandInvestigationResource;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "DMAND_INVS")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DemandInvestigation {

    //test
    @Id
    @GeneratedValue
    @Column(name = "DMAND_INVS_ID")
    private Long id;

    //부처 ID
    @Column(name = "MINISTRY_ID")
    private String ministryId;

    //시스템 ID
    @Column(name = "SYS_ID")
    private String systemId;

    //시스템명
    @Column(name = "SYS_NM")
    private String systemName;

    //업무 ID
    @Column(name = "WORK_ID")
    private String workId;

    //조사연도
    @Column(name = "EXMN_YR")
    private LocalDateTime examinationYear;

    //입주기관 ID
    @Column(name = "RESIDENT_ORG_ID")
    private String residentOrgId;

    //센터구분
    @Column(name = "CNTR_DIV")
    private String centerDiv;

    //상태
    @Column(name = "STTS")
    private String status;

    //비고
    @Column(name = "RMRK")
    private String remarks;

    //AP예산 확보 여부
    @Column(name = "AP_BGT_YN")
    private boolean apBudgetYn;

    //생성일자
    @Column(name = "REG_DT")
    private LocalDateTime registDate;

    //생성자
    @Column(name = "REG_USR")
    private String registUser;

    //수정일자
    @Column(name = "MOD_DT")
    private LocalDateTime modifiedDate;

    //수정자
    @Column(name = "MOD_USR")
    private String modifiedUser;

    // 통합사업
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "UNITY_BIZ_ID")
    private UnityBusiness unityBusiness;


    // 부분설계
    @OneToMany(mappedBy = "demandInvestigation")
    private List<PartDesignResource> partDesignResources = new ArrayList<>();

    // 수요조사 자원
    @OneToMany(mappedBy = "demandInvestigation")
    private List<DemandInvestigationResource> demandInvestigationResources = new ArrayList<>();

    // 수요조사 첨부파일
//    @OneToOne(fetch = LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "sooyojosaFilePath_id")
//    private SooyojosaFilePathEntity sooyojosaFilePath;

    // 노후장비 관리
//    @OneToMany(mappedBy = "demandInvestigation")
//    private List<SuperannuationResource> superannuationResources = new ArrayList<>();


}
