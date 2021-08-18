package com.bookmyshow.app.exceptions.accounts;

public class InvalidCustomerException extends AccountsException {
    public InvalidCustomerException(String message) {
        super(message);
    }
}
