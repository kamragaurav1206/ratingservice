package com.yash.ratingservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<APIResponse> handlerResourceNotFoundException(ResourceNotFoundException exception){
        APIResponse apiResponse = new APIResponse();
        apiResponse.setMessage(exception.getMessage());
        apiResponse.setStatusCode(HttpStatus.NOT_FOUND);
        apiResponse.setSuccess(true);
        return new ResponseEntity(apiResponse,HttpStatus.NOT_FOUND);
    }
}
