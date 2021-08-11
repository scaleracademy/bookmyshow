package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hall extends Auditable {
    private Cinema cinema;
    private String hallNumber;
    private Integer seatCount;
}
