package com.bookmyshow.app.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerProfile extends Auditable {
    private String fullName;
    private String phone;
    private String city;
    private String email;

    private User user; // this profile belongs to this user
}