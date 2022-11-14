package com.code.expenseapp.exceptions;

public class ExpenseNotFoundException extends RuntimeException{
    /**
     *
     */
    private static final long serialVersionUID = 1;

    public ExpenseNotFoundException (String message) {
        super(message);
    }
}
