package com.sunbeam.customException;

public class ExpiredJwtException extends RuntimeException {

	public ExpiredJwtException() {
		super("Token expired please login again!!!");
	}
}
