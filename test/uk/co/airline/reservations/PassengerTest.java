package uk.co.airline.reservations;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PassengerTest {
	
	private Passenger p1;
	
	@Before
	public void settingUpPassanger(){
		p1 = new Passenger("Jane Doe", "Unknown Address", 25);	
	}
	
	@After
	public void tearingDownPassenger(){
		p1 = null;
	}

	@Test
	public void testPassenger() {
		assertEquals("Jane Doe", p1.getName());
		assertEquals("Unknown Address", p1.getAddress());
		assertEquals(25, p1.getAge());
	}

	@Test
	public void testGetName() {
		assertEquals("Jane Doe", p1.getName());
	}

	@Test
	public void testSetName() {
		p1.setName("Harrison Ford");
		assertEquals("Harrison Ford", p1.getName());
	}

	@Test
	public void testGetAddress() {
		assertEquals("Unknown Address", p1.getAddress());
	}

	@Test
	public void testSetAddress() {
		p1.setAddress("Mysterious Address");
		assertEquals("Mysterious Address", p1.getAddress());
	}

	@Test
	public void testGetAge() {
		assertEquals(25, p1.getAge());
	}

	@Test
	public void testSetAge() {
		p1.setAge(28);
		assertEquals(28, p1.getAge());
	}

}
