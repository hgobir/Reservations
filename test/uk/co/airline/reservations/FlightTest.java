package uk.co.airline.reservations;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlightTest {
	
	private Flight f1;
	
	@Before
	public void settingUpFlight(){
		f1 = new Flight("Unknown Departure City", "Unknown Arrival City", 9000, 599.99);
	}
	
	@After
	public void tearingDownFlight(){
		f1 = null;
	}
	
	@Test
	public void testFlight() {
		assertEquals("Unknown Departure City", f1.getDepartureCity());
		assertEquals("Unknown Arrival City", f1.getArrivalCity());
		assertEquals(9000, f1.getFlightNumber());
		assertEquals(599.99, f1.getPrice(), 0.000000001);
	}

	@Test
	public void testGetDepartureCity() {
		assertEquals("Unknown Departure City", f1.getDepartureCity());
	}

	@Test
	public void testSetDepartureCity() {
		f1.setDepartureCity("Mysterious Departure City");
		assertEquals("Mysterious Departure City", f1.getDepartureCity());
	}



	@Test
	public void testGetArrivalCity() {
		assertEquals("Unknown Arrival City", f1.getArrivalCity());
	}

	@Test
	public void testSetArrivalCity() {
		f1.setArrivalCity("Mysterious Arrival City");
		assertEquals("Mysterious Arrival City", f1.getArrivalCity());
	}


	@Test
	public void testGetFlightNumber() {
		assertEquals(9000, f1.getFlightNumber());
				
	}

	@Test
	public void testSetFlightNumber() {
		f1.setFlightNumber(500);
		assertEquals(500, f1.getFlightNumber());	
	}

	@Test
	public void testGetPrice() {
		assertEquals(599.99, f1.getPrice(), 0.000000001);
	}

	@Test
	public void testSetPrice() {
		f1.setPrice(49.99);
		assertEquals(49.99, f1.getPrice(), 0.000000001);
	}

}
