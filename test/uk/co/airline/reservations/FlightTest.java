package uk.co.airline.reservations;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Test;

public class FlightTest {

	@Test
	public void testFlightContructor() {
		Flight f1 = new Flight("Unknown Departure City", new GregorianCalendar().getGregorianChange(), 
				"Unknown Arrival City", new GregorianCalendar().getGregorianChange(),9000, 599.99);
		assertEquals("Unknown Departure City", f1.getDepartureCity());
		assertEquals(new GregorianCalendar().getGregorianChange(), f1.getDepartureTime());
		assertEquals("Unknown Arrival City", f1.getArrivalCity());
		assertEquals(new GregorianCalendar().getGregorianChange(), f1.getArrivalTime());
		assertEquals(9000, f1.getFlightNumber());
		assertEquals(599.99, f1.getPrice(),0.000000001);
	}
	
	

}
