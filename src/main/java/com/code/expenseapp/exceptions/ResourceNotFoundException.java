package com.code.expenseapp.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    /**
     *
     */
    private static final long serialVersionUID = 1;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
