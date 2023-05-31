package com.onerivet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onerivet.models.response.GenericResponse;



@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {

	

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<GenericResponse<?>> resourceNotFoundExceptionHandler(ResourceNotFoundException exception) {

		GenericResponse<?> genericResponse = new GenericResponse<>(null, exception.getMessage());

		return new ResponseEntity<>(genericResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<GenericResponse<?>> methodArgumentNotValidException(MethodArgumentNotValidException exception) {
		
		String defaultMessage = exception.getBindingResult().getAllErrors().get(0).getDefaultMessage();
		
		GenericResponse<?> genericResponse = new GenericResponse<>(null, defaultMessage);

		return new ResponseEntity<>(genericResponse, HttpStatus.BAD_REQUEST);
	}

}
