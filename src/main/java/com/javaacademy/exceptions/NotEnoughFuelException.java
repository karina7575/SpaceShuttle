package com.javaacademy.exceptions;

public class NotEnoughFuelException extends Exception {
    public NotEnoughFuelException() {
    }

    public NotEnoughFuelException(String message) {
        super(message);
    }
}
