package com.example.rpmsdomaintest.domain;

import com.example.rpmsdomaintest.domain.file.SooyojosaFilePathEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class SooyojosaEntity {

    //test

    @Id
    @GeneratedValue
    @Column(name = "sooyojosa_id")
    private Long id;

    // 부분설계
    @OneToMany(mappedBy = "sooyojosaEntity")
    private List<BooboonEntity> booboonEntities = new ArrayList<>();

    // 수요조사 자원
    @OneToMany(mappedBy = "sooyojosaEntity")
    private List<SooyojosaJawonEntity> sooyojosaJawonEntities = new ArrayList<>();


    // 통합사업
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "tonghabsaup_id")
    private TonghabsaupEntity tonghabsaupEntity;

    // 노후장비 관리
    @OneToMany(mappedBy = "sooyojosaEntity")
    private List<NohoojangbiEntity> nohoojangbiEntities = new ArrayList<>();

    // 수요조사 첨부파일
    @OneToOne(fetch = LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "sooyojosaFilePath_id")
    private SooyojosaFilePathEntity sooyojosaFilePath;
}
