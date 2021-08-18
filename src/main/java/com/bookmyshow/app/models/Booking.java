package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Booking extends Exposed {
    private Customer customer;
    private Show show;
    private BookingStatus status;
    List<ShowSeat> seatsBooked;

    public Booking(Customer customer, Show show) {
        this.customer = customer;
        this.show = show;
        this.status = BookingStatus.PAYMENT_PENDING;
    }
}
