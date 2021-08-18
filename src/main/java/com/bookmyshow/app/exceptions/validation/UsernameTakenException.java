package com.bookmyshow.app.exceptions.validation;

public class UsernameTakenException extends ValidationException {
    public UsernameTakenException(String message) {
        super(message);
    }
}
