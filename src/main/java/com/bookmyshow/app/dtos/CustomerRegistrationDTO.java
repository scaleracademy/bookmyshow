package com.bookmyshow.app.dtos;

import lombok.Data;

@Data
public class CustomerRegistrationDTO {
    private String username;
    private String password;
    private String fullName;
    private String phone;
    private String city;
    private String email;
}
