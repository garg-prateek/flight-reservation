package com.garg.Dao;

import com.garg.model.Reservation;

public interface ReservationDAO {

	Reservation bookFlight(Reservation reservation);

	Reservation checkIn(long reservationId, int noOfBags);

}
