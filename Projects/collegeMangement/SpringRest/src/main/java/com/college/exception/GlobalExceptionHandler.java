package com.college.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;





@ControllerAdvice

public class GlobalExceptionHandler {
	@ExceptionHandler(CourseNotFoundException.class)
	public ResponseEntity<?> courseNotFoundHandling(CourseNotFoundException exception,WebRequest request){
		ErrorMessage error = new ErrorMessage(exception.getMessage(),request.getDescription(false));
		return new  ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<?> StudentNotFoundHandling(StudentNotFoundException exception,WebRequest request){
		ErrorMessage error = new ErrorMessage(exception.getMessage(),request.getDescription(false));
		return new  ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}

}
