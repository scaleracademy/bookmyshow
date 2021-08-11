package com.bookmyshow.app.exceptions.validation;

public class PasswordTooSimpleException extends ValidationException {
    public PasswordTooSimpleException(String message) {
        super(message);
    }
}
