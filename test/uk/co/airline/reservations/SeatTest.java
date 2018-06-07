package uk.co.airline.reservations;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SeatTest {
	
	private Seat s1;
	
	@Before
	public void settingUpSeat(){
		s1 = new Seat(23, SeatLevel.BUSINESS_CLASS);	
	}
	
	@After
	public void tearingDownPassenger(){
		s1 = null;
	}

	@Test
	public void testGetSeat() {
		assertEquals(23, s1.getSeatNumber());
	}
	
	@Test
	public void testSetSeat() {
		s1.setSeatNumber(12);
		assertEquals(12, s1.getSeatNumber());
	}
	
	@Test
	public void testGetSeatLevel() {
		assertEquals(SeatLevel.BUSINESS_CLASS, s1.getSeatLevel());
	}
	
	@Test
	public void testSetSeatLevel() {
		s1.setSeatLevel(SeatLevel.PREMIUM_ECONOMY_CLASS);
		assertEquals(SeatLevel.PREMIUM_ECONOMY_CLASS, s1.getSeatLevel());
	}
	
	

}
