package com.asish.demo;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	//handle specific exceptions
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResource(ResourceNotFoundException exception, WebRequest request){
		ErrorDetails errors=new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity(errors,HttpStatus.NOT_FOUND);
	}
	//handle global exception
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleResourceGlobal(Exception exception, WebRequest request){
		ErrorDetails errors=new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity(errors,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
