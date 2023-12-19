package com.example.rpmsdomaintest.domain.jawon;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("C")
public class ServerBackup {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long serverBackup_id;

    private String serverBackup;
}
