package com.bookmyshow.app.dtos;

import com.bookmyshow.app.models.Show;
import com.bookmyshow.app.models.ShowSeat;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class CreateBookingDTO {
    @NonNull
    Show show;
    @NonNull
    List<ShowSeat> showSeats;
}
