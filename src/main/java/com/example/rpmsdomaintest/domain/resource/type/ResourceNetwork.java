package com.example.rpmsdomaintest.domain.resource.type;

import com.example.rpmsdomaintest.domain.resource.Resource;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RESRCE_NTWRK")
@DiscriminatorValue("G")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ResourceNetwork extends Resource {
    //장비구분
    @Column(name = "EQPMN_DIV")
    private String equipmentDiv;

    //기술기준
    @Column(name = "TCHNLGY_STDR")
    private String technologyStandard;


    //SLOT
    @Column(name = "SLOT")
    private String slot;


    //10G 포트수
    @Column(name = "PORT_CO_10G")
    private int portCount10G;

    //1G 포트수
    @Column(name = "PORT_CO_1G")
    private int portCount1G;

    //UTP 포트수
    @Column(name = "PORT_CO_UTP")
    private int portCountUTP;

    //기타 포트수
    @Column(name = "PORT_CO_ETC")
    private int portCountETC;

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

}
