package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "showseats")
public class ShowSeat extends Exposed {
    @ManyToOne
    private HallSeat hallSeat;
    @ManyToOne
    private Show show;
    @ManyToOne
    private Booking booking;
    private boolean occupied;

    @Override
    public String toString() {
        return "ShowSeat{" +
                "hallSeat=" + hallSeat +
                ", show=" + show +
                ", booking=" + booking +
                ", occupied=" + occupied +
                super.toString() +
                '}';
    }
}
