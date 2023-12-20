package com.example.rpmsdomaintest.domain.resource;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "RESRCE")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "RESRCE_DIV")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESRCE_ID")
    private Long id;


    //도입연도
    @Column(name = "INDC_DT")
    private LocalDate inductionDate;

    //업무 ID


    //구성 ID


    //구성자원명
    @Column(name = "COMPOSITION_RESRCE_ID")
    private String compositionResourceId;


    //용도
    @Column(name = "USG")
    private String usage;


    //규격
    @Column(name = "SPCFCT")
    private String specification;


    //삭제여부
    @Column(name = "DEL_YN")
    private boolean delAt;

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

    //노후장비 여부
    @Column(name = "SPANUAT_RESRCE_YN")
    private boolean superannuationEquipmentYn;


}
