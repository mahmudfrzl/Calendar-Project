package com.example.calendarcyberneth.utility;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.net.http.HttpRequest;
import java.time.LocalDateTime;
public class DataResult<T> extends Result{
    private final T data;
    public DataResult(T data,boolean success, String message) {

        super(success, message);
        this.data=data;


    }
    public DataResult(T data, boolean success) {
        super(success);
        this.data=data;
    }


    public T getData() {
        return this.data;
    }

    public DataResult(T data, boolean success, String message, LocalDateTime responseAt) {

        super(success, message, responseAt);
        this.data = data;
    }

    public DataResult(T data, boolean success, String message, LocalDateTime responseAt, HttpStatus status, Integer statusCode) {
        super(success, message, responseAt, status, statusCode);
        this.data = data;
    }

    public DataResult(T data, boolean success, String message, LocalDateTime responseAt, HttpStatus status) {
        super(success, message, responseAt, status);
        this.data = data;
    }
}