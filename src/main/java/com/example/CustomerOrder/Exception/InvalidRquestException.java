package com.example.CustomerOrder.Exception;


public class InvalidRquestException extends RuntimeException {
    public InvalidRquestException(String message) {
        super(message);
    }
}