package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Show extends Exposed {
    private Date startTime; // include Timezone
    private Date endTime;
    private Movie movie;
    private Hall hall;
    private boolean cancelled;

    public boolean isShowPending() {
        return !cancelled && endTime.after(new Date());
    }
}
