package com.atm.service.exception;

public class ATMDetailsNotFoundException extends  RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ATMDetailsNotFoundException(String message) {
        super(message);
    }
}
