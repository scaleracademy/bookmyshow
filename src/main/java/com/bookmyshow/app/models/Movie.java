package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie extends Exposed {
    private String name;
    private Integer durationMinutes;
}
