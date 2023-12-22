package com.example.rpmsdomaintest.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ExceptionResponseDto {

    private int statusCode;

    private int series;

    private String message;

    @Builder
    public ExceptionResponseDto(int statusCode, int series, String message) {
        this.statusCode = statusCode;
        this.series = series;
        this.message = message;
    }

    public static ExceptionResponseDto of(HttpStatus httpStatus, Exception e) {

        return ExceptionResponseDto.builder()
                .statusCode(httpStatus.value())
                .series(httpStatus.series().value())
                .message(e.getMessage())
                .build();
    }
}
