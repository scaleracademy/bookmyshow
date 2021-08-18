package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat extends Exposed {
    private HallSeat hallSeat;
    private Show show;
    private boolean occupied;
}
