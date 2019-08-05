package com.app.sba.exceptionhandler;

public class BusinessException extends RuntimeException {
	private String message;

	public BusinessException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
