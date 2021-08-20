package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "bookings")
public class Booking extends Exposed {
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Show show;
    private BookingStatus status;

    @OneToMany(mappedBy = "booking")
    List<ShowSeat> seatsBooked = new ArrayList<>();

    public Booking(Customer customer, Show show) {
        this.customer = customer;
        this.show = show;
        this.status = BookingStatus.PAYMENT_PENDING;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "customer=" + customer +
                ", show=" + show +
                ", status=" + status +
                ", seatsBooked=" + seatsBooked +
                super.toString() +
                '}';
    }
}
