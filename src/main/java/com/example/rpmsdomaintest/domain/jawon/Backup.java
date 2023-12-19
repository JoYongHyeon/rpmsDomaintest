package com.example.rpmsdomaintest.domain.jawon;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("F")
public class Backup {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long backup_id;

    private String backup;
}
