package com.thirty.exception;

@SuppressWarnings("serial")
public class ServiceException extends Exception {
	private String code;

	public ServiceException() {
		super("业务异常，请重试");
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String code, String message) {
		this(message);
		this.setCode(code);
	}

	public ServiceException(String code, String message, Throwable cause) {
		super(message, cause);
		this.setCode(code);
	}

	public ServiceException(String code, Throwable cause) {
		super(cause);
		this.setCode(code);
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
