package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "shows")
public class Show extends Exposed {
    private Date startTime; // include Timezone
    private Date endTime;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Hall hall;
    private boolean cancelled;
    @OneToMany(mappedBy = "show")
    private List<Booking> bookings = new ArrayList<>();
    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeats = new ArrayList<>();

    public boolean isShowPending() {
        return !cancelled && endTime.after(new Date());
    }

    @Override
    public String toString() {
        return "Show{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", movie=" + movie +
                ", hall=" + hall +
                ", cancelled=" + cancelled +
                ", bookings=" + bookings +
                ", showSeats=" + showSeats +
                super.toString() +
                '}';
    }
}
