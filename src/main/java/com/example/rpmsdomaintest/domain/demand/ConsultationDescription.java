package com.example.rpmsdomaintest.domain.demand;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "CNSLTN_DSCTN")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ConsultationDescription {

    @Id
    @GeneratedValue
    @Column(name = "CNSLTN_DSCTN_ID")
    private Long id;

    //작성자 ID
    @Column(name = "WRTR_ID")
    private String writerId;


    //작성내용
    @Column(name = "WRT_CN")
    private String content;

    //등록일자
    @Column(name = "REG_DT")
    private LocalDateTime registDate;


    //수정일자
    @Column(name = "MOD_DT")
    private LocalDateTime modifiedDate;


    //협의내역 구분
    @Column(name = "CNSLTN_DIV")
    private String consultationDiv;

    //수요조사 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DMAND_INVS_ID")
    private DemandInvestigation demandInvestigation;


}
