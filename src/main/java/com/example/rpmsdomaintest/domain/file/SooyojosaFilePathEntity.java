package com.example.rpmsdomaintest.domain.file;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SooyojosaFilePathEntity {

    @Id
    @GeneratedValue
    @Column(name = "sooyojosaFilePath_id")
    private Long id;

    // 첨부파일
    @OneToMany(mappedBy = "sooyojosaFilePathEntity")
    private List<SooyojosaFileEntity> sooyojosaFileEntities = new ArrayList<>();


}
