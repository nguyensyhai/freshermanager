package com.example.demo.exception;

public class NoDataException extends RuntimeException{
	public NoDataException() {
		super("Data is not existed");
	}

}
