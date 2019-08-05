package com.app.sba.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalController {
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<ErrorDetails> handleBusinessException(BusinessException exception) {

		ErrorDetails details = new ErrorDetails();
		details.setMessage(exception.getMessage());
		details.setStatusCode(HttpStatus.BAD_REQUEST.value());
		ResponseEntity<ErrorDetails> response = new ResponseEntity<>(details, HttpStatus.BAD_REQUEST);
		return response;

	}

	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<ErrorDetails> handleValidationException(ValidationException exception) {

		ErrorDetails details = new ErrorDetails();
		details.setMessage(exception.getMessage());
		details.setStatusCode(HttpStatus.CREATED.value());
		ResponseEntity<ErrorDetails> response = new ResponseEntity<>(details, HttpStatus.CREATED);
		return response;

	}

}
