package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "customers")
public class Customer extends Exposed {
    private String fullName;
    private String phone;
    private String city;
    private String email;

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings = new ArrayList<>();

    @OneToOne
    private User user; // this profile belongs to this user

    public Customer(@NonNull User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", bookings=" + bookings +
                ", user=" + user +
                super.toString() +
                '}';
    }
}