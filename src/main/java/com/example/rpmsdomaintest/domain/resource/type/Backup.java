package com.example.rpmsdomaintest.domain.resource.type;

import com.example.rpmsdomaintest.domain.resource.Resource;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RESRCE_BACKUP")
@DiscriminatorValue("F")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Backup extends Resource {

    //장비 구분
    @Column(name = "EQPMN_DIV")
    private String equipmentDiv;

    //기술기준
    @Column(name = "TCHNLGY_STDR")
    private String technologyStandard;

    //백업방식
    @Column(name = "BACKUP_MTHD")
    private String backupMethod;


    //백업용량
    @Column(name = "BACKUP_CPCTY")
    private int backupCapacity;

    //상면_전산실
    @Column(name = "CMPT_ROOM")
    private String computationRoom;

    //상면_설치좌표
    @Column(name = "INSTL_CRDNT")
    private String installationCoordinate;

    //망 구분
    @Column(name = "NET_DIV")
    private String networkDiv;

    //영역구분
    @Column(name = "AREA_DIV")
    private String areaDiv;

    //백업형태
    @Column(name = "BACKUP_STLE")
    private String backupStyle;
}
