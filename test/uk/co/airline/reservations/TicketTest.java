package uk.co.airline.reservations;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TicketTest {
	
	private Ticket t1;

	@Before
	public void setUp() throws Exception {
		t1 = new Ticket();
	}

	@After
	public void tearDown() throws Exception {
		t1 = null;
	}

	@Test
	public void testSetPassenger() {
		Passenger p1 = new Passenger("Hamza Gobir", "London", 25);
		t1.setPassenger(p1);
		assertEquals(p1, t1.getPassenger());
	}
	
	@Test
	public void testSetSeat() {
		Seat s1 = new Seat(1, SeatLevel.BUSINESS_CLASS);
		t1.setSeat(s1);
		assertEquals(s1, t1.getSeat());
	}
	
	@Test
	public void testSetFlight() {
		Flight f1 = new Flight("Moscow", "Leeds", 2512, 400.0);
		t1.setFlight(f1);
		assertEquals(f1, t1.getFlight());
	}

}
