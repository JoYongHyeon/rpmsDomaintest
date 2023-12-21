package com.example.rpmsdomaintest.domain.demand.resource.history;

import com.example.rpmsdomaintest.domain.demand.resource.DemandInvestigationResource;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "DMAND_RESRCE_HSTRY")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DemandResourceHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DMAND_RESRCE_HSTRY_ID")
    private Long id;


    //구성자원명
    @Column(name = "COMPOSITION_RESRCE_NM")
    private String compositionResourceName;

    //자산ID
    @Column(name = "RESRCE_ID")
    private String resourceId;

    //시스템명
    @Column(name = "SYS_NM")
    private String systemName;

    //예산구분
    @Column(name = "BGT_DIV")
    private String budgetDiv;

    //사업구분
    @Column(name = "BIZ_DIV")
    private String businessDiv;

    //자원구분
    @Column(name = "RESRCE_DIV")
    private String resourceDiv;

    //수요조사 구분
    @Column(name = "DMAND_EXMN_DIV")
    private String demandExaminationDiv;

    //예산액
    @Column(name = "BGT")
    private Long budget;

    //클라우드 적용여부
    @Column(name = "CLOUD_APPLY_YN")
    private boolean cloudApplyYn;

    //개별편성 적용여부
    @Column(name = "INDIV_FRMTN_YN")
    private boolean  individualFormationYn;

    //생성일자
    @Column(name = "REG_DT")
    private LocalDateTime registDate;

    //생성자
    @Column(name = "REG_USR")
    private String registUser;

    //삭제여부
    @Column(name = "DEL_YN")
    private boolean delYn;

    //비고
    @Column(name = "RMRK")
    private String remarks;

    //수정 내역
    @Column(name = "MDFCN_DSCTN")
    private String modificationDescription;

    //수정 내용
    @Column(name = "MDFCN_BFR_CN")
    private String modificationBeforeContent;

    //수정 컬럼
    @Column(name = "MDFCN_COL")
    private String modificationColumn;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DMAND_INVS_RESRCE_ID")
    private DemandInvestigationResource demandInvestigationResource;
}
