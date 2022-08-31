package com.garg.Dao;

import java.util.HashMap;

import com.garg.model.Flight;
import com.garg.model.Reservation;

public class ReservationDaoImpl implements ReservationDAO {

	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;
	long reservationId;

	public ReservationDaoImpl() {
		reservations = new HashMap<>();

		flights = new HashMap<>();
		Flight flight1 = new Flight();
		flight1.setId(1l);
		flight1.setFlightNumber("123");
		flight1.setOperatingAirlines("AirIndia");
		flight1.setDepartureCity("Bhopal");
		flight1.setArrivalCity("Hyderabad");
		flight1.setDatAndTimeOfDeparture("14/09/2022  2:30pm");

		flights.put(flight1.getId(), flight1);

		Flight flight2 = new Flight();
		flight2.setId(2l);
		flight2.setFlightNumber("456");
		flight2.setOperatingAirlines("Indigo");
		flight2.setDepartureCity("Mumbai");
		flight2.setArrivalCity("Delhi");
		flight2.setDatAndTimeOfDeparture("15/09/2022  2:30pm");

		flights.put(flight2.getId(), flight2);

	}

	@Override
	public Reservation bookFlight(Reservation reservation) {
		Flight flight = flights.get(reservation.getFlightId());
		reservation.setFlight(flight);
		reservationId = reservationId + 1;
		reservation.setId(reservationId);

		reservations.put(reservationId, reservation);
		return reservation;
	}

	@Override
	public Reservation checkIn(long reservationId, int noOfBags) {
		Reservation reservation = reservations.get(reservationId);
		reservation.setNoOfBags(noOfBags);
		reservation.setCheckedIn(true);
		return reservation;
	}

}
