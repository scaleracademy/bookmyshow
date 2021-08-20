package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "hallseats")
public class HallSeat extends Auditable {
    private String seatLocation;
    private String seatType;
    private boolean isUnderMaintenance;
    @ManyToOne
    private Hall hall;

    @OneToMany(mappedBy = "hallSeat")
    private List<ShowSeat> showSeats = new ArrayList<>();

    @Override
    public String toString() {
        return "HallSeat{" +
                "seatLocation='" + seatLocation + '\'' +
                ", seatType='" + seatType + '\'' +
                ", isUnderMaintenance=" + isUnderMaintenance +
                ", hall=" + hall +
                ", showSeats=" + showSeats +
                super.toString() +
                '}';
    }
}
