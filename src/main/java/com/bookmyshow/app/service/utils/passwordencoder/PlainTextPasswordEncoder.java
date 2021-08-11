package com.bookmyshow.app.service.utils.passwordencoder;

public class PlainTextPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(String plainText) {
        return "encoded-" + plainText;
    }
}
