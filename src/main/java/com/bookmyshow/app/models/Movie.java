package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "movies")
public class Movie extends Exposed {
    private String name;
    private Integer durationMinutes;
    @OneToMany(mappedBy = "movie")
    private List<Show> shows = new ArrayList<>();

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", durationMinutes=" + durationMinutes +
                ", shows=" + shows +
                super.toString() +
                '}';
    }
}
