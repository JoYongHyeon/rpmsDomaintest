package com.example.rpmsdomaintest.domain.demand.resource.type;

import com.example.rpmsdomaintest.domain.demand.resource.DemandInvestigationResource;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DMAND_RESRCE_SERVER_BACKUP")
@DiscriminatorValue("C")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DemandResourceServerBackup extends DemandInvestigationResource {

    //백업 방식
    @Column(name = "MTHD")
    private String backupMethod;


    //백업 매체
    @Column(name = "MEDIA")
    private String bakcupMedia;

    //백업 필요용량
    @Column(name = "RQRD_CPCTY")
    private int requiredCapacity;

    //백업형태
    @Column(name = "STLE")
    private String backupStyle;

}
