package com.example.rpmsdomaintest.response;

import lombok.Builder;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

import java.util.List;

public class GridResponseDto<T> {

    private final static String SUCCESS_MESSAGE = "SUCCES";

    private boolean result;
    private int statusCode;
    private String message;
    private ResultData<T> data;

    @Builder
    public GridResponseDto(int statusCode, String message, ResultData<T> data) {
        this.result = true;
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public static <T> GridResponseDto<T> ofSuccess(Page<T> response){

        return GridResponseDto.<T>builder()
                .statusCode(HttpStatus.OK.value())
                .message(SUCCESS_MESSAGE)
                .data(new ResultData<>(response))
                .build();
    }
    private static class ResultData<T> {
        private int page;
        private int size;
        private Long totalCount;
        private List<T> contents;
        public ResultData(Page<T> response) {
            this.page = response.getPageable().getPageNumber();
            this.size = response.getPageable().getPageSize();
            this.totalCount = response.getTotalElements();
            this.contents = response.getContent();
        }
    }
}



