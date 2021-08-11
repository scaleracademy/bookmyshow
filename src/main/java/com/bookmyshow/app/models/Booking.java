package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Booking extends Auditable {
    private User user;
    private Show show;
    List<ShowSeat> seatsBooked;
}
