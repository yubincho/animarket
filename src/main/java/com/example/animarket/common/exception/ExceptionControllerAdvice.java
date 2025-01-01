package com.example.animarket.common.exception;


import com.example.animarket.common.dto.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(SimpleRunAppException.class)
    public ResponseEntity<?> errorHandler(SimpleRunAppException e) {
//        log.error("Error occurs - Code: {}, Message: {}, Detail: {}",
//                e.getErrorCode(), e.getErrorCode().getMessage(), e.getDetailMessage());

        return ResponseEntity.status(e.getErrorCode().getStatus())
                .body(Response.error(
                        e.getErrorCode().getStatus(),
                        e.getErrorCode().getMessage(),
                        e.getDetailMessage()
                ));
    }


    // 예외 추가할 것들 --->
    // 인증, 인가 오류
    // 키 중복 (Redis )
    // aws s3 통신 에러
    // 데이터 무결성 위반
    // Valid 익셉션 처리


}
