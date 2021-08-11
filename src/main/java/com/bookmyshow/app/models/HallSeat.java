package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HallSeat extends Auditable {
    private String seatLocation;
    private String seatType;
    private boolean isUnderMaintainace;
}
