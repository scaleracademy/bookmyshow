package com.bookmyshow.app.dtos;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class CustomerRegistrationDTO {
    private String username;
    private String password;
    private String fullName;
    private String phone;
    private String city;
    private String email;
}
