package com.huzaifa.project.uber.uberApp.advices;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiResponse<T> {



    private LocalDateTime timesStamps;
    private T data;
    private ApiError error;

    public ApiResponse() {
        this.timesStamps = LocalDateTime.now();
    }

    public ApiResponse(T data) {
        this();
        this.data = data;
    }

    public ApiResponse(ApiError error) {
        this();
        this.error = error;
    }
}
