package com.programacion.reactiva;

public class CustomException extends Exception {
    public CustomException (String message, Throwable exception) {
        super(message, exception);
    }
}
