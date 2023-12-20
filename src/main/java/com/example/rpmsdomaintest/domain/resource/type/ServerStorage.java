package com.example.rpmsdomaintest.domain.resource.type;

import com.example.rpmsdomaintest.domain.resource.Resource;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RESRCE_SERVER_STORAGE")
@DiscriminatorValue("B")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ServerStorage extends Resource {

    //연결방식
    @Column(name = "LNKG_MTHD")
    private String linkageMethod;

    //필요용량 - SAN_OS
    @Column(name = "RQRD_CPCTY_SAN_OS")
    private int requiredCapacityOS;


    //필요용량 - SAN_DATA
    @Column(name = "RQRD_CPCTY_SAN_DATA")
    private int requiredCapacitySanData;

    //필요량 - NAS
    @Column(name = "RQRD_CPCTY_NAS")
    private int requiredCapacityNas;

    //RAID type
    @Column(name = "RAID_TY")
    private String raidType;

    //복제유무
    @Column(name = "REPRODC_YN")
    private boolean reproduceYn;

    //망구분
    @Column(name = "NET_DIV")
    private String networkDiv;

    //스토리지 할당
    @Column(name = "STORAGE_ASGN")
    private String storageAssignment;
}
