package com.example.rpmsdomaintest.domain;

import com.example.rpmsdomaintest.domain.demand.DemandInvestigation;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UnityBiz {

    @Id
    @GeneratedValue
    @Column(name = "UNITY_BIZ_ID")
    private Long id;

    // 수요조사
    @OneToMany(mappedBy = "unityBiz")
    private List<DemandInvestigation> sooyojosaEntities = new ArrayList<>();
}
