package com.example.rpmsdomaintest.domain.resource.type;

import com.example.rpmsdomaintest.domain.resource.Resource;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RESRCE_SERVER")
@DiscriminatorValue("A")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Server extends Resource {

    //서버용도
    @Column(name = "SRVR_PRPS")
    private String serverPurpose;

    //OS
    @Column(name = "OS")
    private String osType;

    //필요용량 - CPU
    @Column(name = "RQRD_CPU")
    private int requiredCpu;

    //필요용량 - 메모리
    @Column(name = "RQRD_MEM")
    private int requiredMemory;

    //필요용량 - 디스크
    @Column(name = "RQRD_DISK")
    private int requiredDisk;

    //필요용량 - GPU
    @Column(name = "RQRD_GPU")
    private int requiredGpu;


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


    //망 연계 적용 여부
    @Column(name = "NET_LINK_YN")
    private boolean networkLinkYn;


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
