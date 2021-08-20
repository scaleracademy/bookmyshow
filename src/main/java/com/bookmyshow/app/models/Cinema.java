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
@Table(name = "cinemas")
public class Cinema extends Exposed {
    private String name;
    private String address;
    @OneToMany(mappedBy = "cinema")
    private List<Hall> halls = new ArrayList<>();

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", halls=" + halls +
                super.toString() +
                '}';
    }
}
