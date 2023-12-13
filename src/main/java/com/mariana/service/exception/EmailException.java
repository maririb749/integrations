package com.mariana.service.exception;

@SuppressWarnings("serial")
public class EmailException extends RuntimeException{
	
	public EmailException(String msg) {
		super(msg);
	}

}
