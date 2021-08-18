package com.bookmyshow.app.services.utils.passwordencoder;

public class PlainTextPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(String plainText) {
        return "encoded-" + plainText;
    }
}
