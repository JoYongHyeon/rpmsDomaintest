package com.example.rpmsdomaintest.domain.demand.resource.type;

import com.example.rpmsdomaintest.domain.demand.resource.DemandInvestigationResource;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
    @Column(name = "10G_PORT_CO")
    private int portCount10G;

    //1G 포트수
    @Column(name = "1G_PORT_CO")
    private int portCount1G;

    //UTP 포트수
    @Column(name = "UTP_PORT_CO")
    private int portCountUTP;

    //기타 포트수
    @Column(name = "ETC_PORT_CO")
    private String portCountETC;

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
