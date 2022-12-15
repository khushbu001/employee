package com.employee.employeemanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class EmployeeException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<CustomExceptions> handleAllExceptions(CustomExceptions ex, WebRequest request) {
		CustomExceptions exceptionResponse = new CustomExceptions(ex.getTimestamp(), ex.getError(), request.getDescription(false),
				ex.getMessage(), ex.getStatus());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(CustomExceptions.class)
	public final ResponseEntity<CustomExceptions> handleInvalidException(CustomExceptions ex, WebRequest request) {
		CustomExceptions customExceptions = new CustomExceptions(ex.getTimestamp(), ex.getHttpCodeMessage(),
				ex.getError(), ex.getMessage(), ex.getStatus());
		return new ResponseEntity<>(customExceptions, HttpStatus.BAD_REQUEST);
	}

}
