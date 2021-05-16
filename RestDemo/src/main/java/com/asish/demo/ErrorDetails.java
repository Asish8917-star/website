package com.asish.demo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String details;

}
