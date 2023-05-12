package com.colabear754.authentication_example_java.handler;

import com.colabear754.authentication_example_java.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ExceptionResponseHandler {
    @ExceptionHandler({IllegalArgumentException.class, NoSuchElementException.class})
    public ResponseEntity<ApiResponse> handleIllegalArgumentException(Exception e) {
        return ResponseEntity.badRequest().body(ApiResponse.error(e.getMessage()));
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ApiResponse> handleAccessDeniedException() {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ApiResponse.error("접근이 거부되었습니다."));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse> handleException() {
        return ResponseEntity.internalServerError().body(ApiResponse.error("서버에 문제가 발생했습니다."));
    }
}
