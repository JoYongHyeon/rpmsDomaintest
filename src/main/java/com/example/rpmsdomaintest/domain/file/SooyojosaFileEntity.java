package com.example.rpmsdomaintest.domain.file;

import jakarta.persistence.*;

@Entity
public class SooyojosaFileEntity {

    @Id
    @GeneratedValue
    @Column(name = "sooyojosaFile_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sooyojosaFilePath_id")
    private SooyojosaFilePathEntity sooyojosaFilePathEntity;

}
