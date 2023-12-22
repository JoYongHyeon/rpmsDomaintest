package com.example.rpmsdomaintest.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class DetailResponseDto<T> {

    private int statusCode;
    private String message;
    private T data;

    @Builder
    public DetailResponseDto(int statusCode, String message, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public static <T> DetailResponseDto<T> of(T data) {
        return DetailResponseDto.<T>builder()
                .statusCode(HttpStatus.OK.value())
                .message("SUCCESS")
                .data(data)
                .build();
    }
}
