package com.example.calendarcyberneth.utility;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;

import java.net.http.HttpRequest;
import java.time.LocalDateTime;
@Getter
public class Result {
    private String message;
    private boolean success;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime responseAt;
    private Integer statusCode;
    private HttpStatus status;


    public Result(boolean success) {
        this.success=success;
    }
    public Result( boolean success,String message,LocalDateTime responseAt) {
        this(success);
        this.responseAt = responseAt;
        this.message = message;

    }
    public Result( boolean success,String message,LocalDateTime responseAt,HttpStatus status,Integer statusCode) {
        this(success);
        this.responseAt = responseAt;
        this.message = message;
        this.status =status;
        this.statusCode = statusCode;

    }
    public Result( boolean success,String message,LocalDateTime responseAt,HttpStatus status) {
        this(success);
        this.responseAt = responseAt;
        this.message = message;
        this.status = status;

    }
    public Result( boolean success,String message) {
        this(success);
        this.message = message;

    }



}
