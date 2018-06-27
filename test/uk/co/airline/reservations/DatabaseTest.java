package uk.co.airline.reservations;

import static org.junit.Assert.*;

import java.time.LocalDate;

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
	public void testThatDuplicatedPassengerIsNotAddedToDatabase() {
		Passenger p1 = new Passenger("Jason Thanni", "Camden", 25);
		assertEquals(false, db1.addPassenger(p1));
		assertEquals(1, db1.getPassengers().size());
		Passenger p2 = new Passenger("Jason Thanni", "Camden", 25);
		assertEquals(true, db1.addPassenger(p2));
		assertEquals(1, db1.getPassengers().size());
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
	
	@Test
	public void testBootstrapSeatsMethod() {
		BoeingPlane b1 = new BoeingPlane();
		db1.bootstrapSeats(b1, 5);
		
		assertEquals(5, db1.getSeats().size());
		assertEquals(5, b1.getSeatingPlan().size());
		assertEquals(SeatLevel.PREMIUM_ECONOMY_CLASS, b1.getSeatingPlan().get(0).getSeatLevel());
	}
	
	@Test
	public void testBootstrapFlightsMethod() {
		db1.bootstrapFlights(10);
		
		assertEquals(10, db1.getFlights().size());
		assertEquals("Unknown Arrival City", db1.getFlights().get(0).getArrivalCity());
		assertEquals(2000, db1.getFlights().get(2).getFlightNumber());
	}
	
	@Test
	public void testPurchaseTicketMethodCreatesTicket() {
		Seat s1 = new Seat(1, SeatLevel.BUSINESS_CLASS);
		Passenger p1 = new Passenger("Jason Thanni", "Camden", 25);
		Flight f1 = new Flight("London", "Paris", 500, 999.99);
		BoeingPlane b1 = new BoeingPlane();
		db1.bootstrapSeats(b1, 5);
		db1.bootstrapFlights(10);
		db1.purchaseTicket(LocalDate.now(), p1, f1.getFlightNumber(),s1.getSeatNumber());
			
		assertEquals(1, db1.getTickets().size());
	}
	
	
	

}
