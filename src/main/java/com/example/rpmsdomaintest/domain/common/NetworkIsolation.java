package com.example.rpmsdomaintest.domain.common;

public enum NetworkIsolation {
    INTERNAL("내부"), EXTERNAL("외부"), ISOLATION("고립");
    private final String status;

    NetworkIsolation(String status) {
        this.status = status;
    }
}
