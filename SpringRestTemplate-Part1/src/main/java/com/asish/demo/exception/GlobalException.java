package com.asish.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<?> handleException(DataNotFoundException exception, WebRequest request){
		ExceptionDetails details=new ExceptionDetails(request.getDescription(false), exception.getMessage(), new Date());
		return new ResponseEntity(details, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleExceptiondetails(DataNotFoundException exception, WebRequest request){
		ExceptionDetails details=new ExceptionDetails(request.getDescription(false), exception.getMessage(), new Date());
		return new ResponseEntity(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
