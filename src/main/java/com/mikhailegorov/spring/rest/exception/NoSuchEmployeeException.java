package com.mikhailegorov.spring.rest.exception;

public class NoSuchEmployeeException extends RuntimeException {
    public NoSuchEmployeeException (String message) {
        super(message);
    }
}