package com.example.rpmsdomaintest.domain.unity;

import com.example.rpmsdomaintest.domain.demand.DemandInvestigation;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "UNITY_BIZ")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UnityBusiness {

    @Id
    @GeneratedValue
    @Column(name = "UNITY_BIZ_ID")
    private Long id;

    //연도
    @Column(name = "EXMN_YR")
    private String examinationYear;


    //센터 구분
    @Column(name = "CNTR_DIV")
    private String centerDiv;

    //통합사업명
    @Column(name = "UNITY_BIZ_NM")
    private String unityBusinessName;

    //통합 발주일자
    @Column(name = "ORDER_DT")
    private LocalDate orderDate;

    //등록일자
    @Column(name = "REG_DT")
    private LocalDateTime registDate;

    //등록자
    @Column(name = "REG_USR")
    private String registUser;


    //수정일자
    @Column(name = "MOD_DT")
    private LocalDateTime modifiedDate;

    //수정자
    @Column(name = "MOD_USR")
    private String modifiedUser;

    //  수요조사 매핑
    @OneToMany(mappedBy = "unityBusiness")
    private List<DemandInvestigation> demandInvestigations = new ArrayList<>();
}
