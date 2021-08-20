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
@Table(name = "halls")
public class Hall extends Exposed {
    private String hallNumber;
    private Integer seatCount;
    @ManyToOne
    private Cinema cinema;
    @OneToMany(mappedBy = "hall")
    private List<HallSeat> hallSeats = new ArrayList<>();
    @OneToMany(mappedBy = "hall")
    private List<Show> shows = new ArrayList<>();

    @Override
    public String toString() {
        return "Hall{" +
                "hallNumber='" + hallNumber + '\'' +
                ", seatCount=" + seatCount +
                ", cinema=" + cinema +
                ", hallSeats=" + hallSeats +
                ", shows=" + shows +
                super.toString() +
                '}';
    }
}
