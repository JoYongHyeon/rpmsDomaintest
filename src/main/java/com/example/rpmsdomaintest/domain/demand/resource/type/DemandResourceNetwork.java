package com.example.rpmsdomaintest.domain.demand.resource.type;

import com.example.rpmsdomaintest.domain.common.NetworkIsolation;
import com.example.rpmsdomaintest.domain.demand.resource.DemandInvestigationResource;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DMAND_RESRCE_NTWRK")
@DiscriminatorValue("G")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DemandResourceNetwork extends DemandInvestigationResource {

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
    private String portCountETC;

    //상면_전산실
    @Column(name = "CMPT_ROOM")
    private String computationRoom;

    //상면_설치좌표
    @Column(name = "INSTL_CRDNT")
    private String installationCoordinate;

    //망 구분
    @Column(name = "NET_DIV")
    @Enumerated(value = EnumType.STRING)
    private NetworkIsolation networkDiv;

    //영역구분
    @Column(name = "AREA_DIV")
    private String areaDiv;

}
