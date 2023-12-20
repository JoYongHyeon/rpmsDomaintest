package com.example.rpmsdomaintest.domain.resource.type;

import com.example.rpmsdomaintest.domain.resource.Resource;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RESRCE_SERVER_SYSTEM")
@DiscriminatorValue("D")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ServerSystem extends Resource {

    //서버용도
    @Column(name = "SRVR_USG")
    private String serverUsage;

    //SW용도
    @Column(name = "SW_USG")
    private String swUsage;

    //제품명
    @Column(name = "PRDCT_NM")
    private String productName;

    //서버기반(OS)
    @Column(name = "OS")
    private String os;

    //라이선스 타입
    @Column(name = "LCNS_TY")
    private String licenseType;


    //라이선스 유형
    @Column(name = "LCNS_CTGRY")
    private String licenseCategory;


    //버전
    @Column(name = "VER")
    private String version;

    //서버
    @Column(name = "SRVR_CPU")
    private int serverCpu;

    //라이선스 전체 수량
    @Column(name = "LCNS_TOTAL_CO")
    private int licenseTotalCount;

    //라이선스 구매 수량
    @Column(name = "LCNS_PRCHS_CO")
    private int licensePurchaseCount;

    //구매 타입
    @Column(name = "PRCHS_TY")
    private String purchaseType;
}
