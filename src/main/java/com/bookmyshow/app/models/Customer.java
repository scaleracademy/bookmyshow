package com.bookmyshow.app.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Customer extends Exposed {
    private String fullName;
    private String phone;
    private String city;
    private String email;

    @NonNull
    private User user; // this profile belongs to this user

    public Customer(@NonNull User user) {
        this.user = user;
    }
}