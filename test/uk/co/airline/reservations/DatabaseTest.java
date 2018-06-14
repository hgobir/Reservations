package uk.co.airline.reservations;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DatabaseTest {
	
	private Database db1;

	@Before
	public void settingUpDatabase() throws Exception {
		db1 = new Database();
	}

	@After
	public void tearingDownDatabase() throws Exception {
		db1 = null;
	}

	@Test
	public void testDatabase() {
		assertEquals(0, db1.getSeats().size());
		assertEquals(0, db1.getPassengers().size());
		assertEquals(0, db1.getSeats().size());
		assertEquals(0, db1.getTickets().size());
	}
	
	@Test
	public void testThatOneSeatAddedToDatabase() {
		Seat s1 = new Seat(3, SeatLevel.BUSINESS_CLASS);
		db1.addSeat(s1);
		assertEquals(1, db1.getSeats().size());
		assertEquals(3, db1.getSeats().get(0).getSeatNumber());
	}
	@Test
	public void testThatOnePassengerAddedToDatabase() {
		Passenger p1 = new Passenger("Jason Thanni", "Camden", 25);
		db1.addPassenger(p1);
		assertEquals(1, db1.getPassengers().size());
		assertEquals("Jason Thanni", db1.getPassengers().get(0).getName());
	}
	
	@Test
	public void testThatOneFlightAddedToDatabase() {
		Flight f1 = new Flight("London", "Paris", 500, 999.99);
		db1.addFlight(f1);
		assertEquals(1, db1.getFlights().size());
		assertEquals("London", db1.getFlights().get(0).getDepartureCity());
	}
	
	@Test
	public void testThatOneTicketAddedToDatabase() {
		Seat s1 = new Seat(1, SeatLevel.BUSINESS_CLASS);
		Passenger p1 = new Passenger("Jason Thanni", "Camden", 25);
		Flight f1 = new Flight("London", "Paris", 500, 999.99);
		Ticket t1 = new Ticket(s1, f1, p1);
		db1.addTicket(t1);
		assertEquals(1, db1.getTickets().size());
		assertEquals(s1, db1.getTickets().get(0).getSeat());

	}

}
