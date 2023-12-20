package com.example.rpmsdomaintest.domain.resource.type;

import com.example.rpmsdomaintest.domain.resource.Resource;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RESRCE_SECURITY_EQPMNT")
@DiscriminatorValue("H")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SecurityEquipment extends Resource {

    //장비구분
    @Column(name = "EQPMN_DIV")
    private String equipmentDiv;

    //기술기준
    @Column(name = "TCHNLGY_STDR")
    private String technologyStandard;

    //처리 성능
    @Column(name = "PRCS_PRFOMNC")
    private String processPerformance;

    //포트 타입
    @Column(name = "PORT_TY")
    private String portType;

    //포트 수량
    @Column(name = "PORT_CO")
    private int portCount;


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


    //HW 성능 - CPU
    @Column(name = "CPU")
    private int cpuPerformance;

    //HW 성능 - 메모리
    @Column(name = "MEM")
    private int memoryPerformance;

    //HW 성능 - 디스크
    @Column(name = "DISK")
    private int diskPerformance;
}
