package com.example.rpmsdomaintest.domain.resource.type;

import com.example.rpmsdomaintest.domain.resource.Resource;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "RESRCE_STORAGE")
@DiscriminatorValue("E")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Storage extends Resource {

    //장비구분
    @Column(name = "EQPMN_DIV")
    private String equipmentDiv;

    //기술기준
    @Column(name = "TCHNLGY_STDR")
    private String technologyStandard;

    //연결방식
    @Column(name = "LNKG_MTHD")
    private String linkageMethod;

    //RAID type
    @Column(name = "RAID_TY")
    private String raidType;

    //인터페이스
    @Column(name = "INTRFC")
    private String storageInterface;

    //필요용량
    @Column(name = "RQRD_CPTCY")
    private int requiredCapacity;

    //복제유무
    @Column(name = "REPRODC_YN")
    private boolean reproduceYn;

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

    //스토리지 형태
    @Column(name = "STORAGE_STLE")
    private String storageStyle;

    //네트워크_구성ID;
    @Column(name = "NET_COMPOSITION_ID")
    private String networkComopsitionId;

    //네트워크_모델명
    @Column(name = "NET_MDL_NM")
    private String networkModelName;

    //네트워크_사용포트 - 10G
    @Column(name = "NET_USE_10G")
    private int networkUsePort10G;

    //네트워크_사용포트 - 1G:
    @Column(name = "NET_USE_1G")
    private int networkUsePort1G;

    //네트워크_사용포트 - UTP
    @Column(name = "NET_USE_UTP")
    private int networkUsePortUTP;

    //사용포트수
    @Column(name = "NET_USE_PORT_CO")
    private int networkUsePortCount;
}
