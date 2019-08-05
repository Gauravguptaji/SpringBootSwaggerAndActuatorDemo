package com.app.sba.exceptionhandler;

public class ErrorDetails {

	private String message;
	private Integer statusCode;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "ErrorDetails [message=" + message + ", statusCode=" + statusCode + "]";
	}

}
