package com.bookmyshow.app.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Show extends Auditable {
    private Date startTime; // include Timezone
    private Date endTime;
    private Movie movie;
    private Hall hall;
}
