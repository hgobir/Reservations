package uk.co.airline.reservations;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CharterTest {
	
	private Charter c1;
	
	@Before
	public void settingUpCharter(){
		c1 = new Charter("Unknown Departure City", "Unknown Arrival City", 9000, 599.99, "2019-07-20T12:00");
	}
	
	@After
	public void tearingDownCharter(){
		c1 = null;
	}

	@Test
	public void testCharter() {
		assertEquals(9000, c1.getFlightNumber());
		assertEquals("2019-07-20T12:00", c1.getDepartureDateTime().toString());
	}
	
	@Test
	public void testCharterToString() {
		assertEquals(9000, c1.);
		assertEquals("2019-07-20T12:00", c1.getDepartureDateTime().toString());
	}

}
