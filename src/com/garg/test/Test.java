package com.garg.test;

import com.garg.Dao.ReservationDAO;
import com.garg.Dao.ReservationDaoImpl;
import com.garg.model.Passenger;
import com.garg.model.Reservation;

public class Test {

	public static void main(String[] args) {

		ReservationDAO dao = new ReservationDaoImpl();
		Reservation reservation = new Reservation();
		Passenger passenger = new Passenger();
		passenger.setId(123l);
		passenger.setFirstName("John");
		passenger.setLastName("Modi");
		passenger.setEmail("John.modi@yahoo.com");
		reservation.setPassenger(passenger);
		reservation.setFlightId(1l);
		Reservation savedReservation = dao.bookFlight(reservation);
		System.out.println(savedReservation);

		Reservation checkIn = dao.checkIn(savedReservation.getId(), 2);
		System.out.println(checkIn);
	}

}
