package com.example.rpmsdomaintest.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype")
public class SooyojosaJawonEntity {

    @Id
    @GeneratedValue
    @Column(name = "sooyojosaJawon_id")
    private Long id;

    // 수요조사 자원
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "sooyojosa_id")
    private SooyojosaEntity sooyojosaEntity;

    // 부처 아이디
    private String booChu;
    // 자산 아이디
    private String jaSan;
    // 시스템 명
    private String systemName;
    // 예산 구분
    private String yeSan;
    // 사업 구분
    private String saUp;
    // 자원 구분
    private String jaWon;
    // 수요조사 구분
    private String sooYo;
    // 예산액(백만원)
    private String yeSan100;
    // 클라우드 적용여부
    private String cloudYn;
    // 개별편성 적용여부
    private String selfYn;
    // 생성일자
    private String createDt;
    // 생성자
    private String create;
    // 삭제여부
    private String delAt;
    // 비고
    private String biGo;
}
