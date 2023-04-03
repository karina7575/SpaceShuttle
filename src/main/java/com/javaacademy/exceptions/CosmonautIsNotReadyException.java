package com.javaacademy.exceptions;

public class CosmonautIsNotReadyException extends Exception {
    public CosmonautIsNotReadyException() {
    }

    public CosmonautIsNotReadyException(String message) {
        super(message);
    }
}
