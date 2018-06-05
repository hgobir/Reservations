package uk.co.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassengerTest {

	@Test
	public void testPassengerConstructor() {
		Passenger p1 = new Passenger("Jane Doe", "Unknown Address", 25);
		assertEquals("Jane Doe", p1.getName());
		assertEquals("Unknown Address", p1.getAddress());
		assertEquals(25, p1.getAge());
	}

	@Test
	public void testGetName() {
		Passenger p1 = new Passenger("Jane Doe", "Unknown Address", 25);
		assertEquals("Jane Doe", p1.getName());
	}

	@Test
	public void testSetName() {
		Passenger p1 = new Passenger("Jane Doe", "Unknown Address", 25);
		p1.setName("Harrison Ford");
		assertEquals("Harrison Ford", p1.getName());
	}

	@Test
	public void testGetAddress() {
		Passenger p1 = new Passenger("Jane Doe", "Unknown Address", 25);
		assertEquals("Unknown Address", p1.getAddress());
	}

	@Test
	public void testSetAddress() {
		Passenger p1 = new Passenger("Jane Doe", "Unknown Address", 25);
		p1.setAddress("Mysterious Address");
		assertEquals("Mysterious Address", p1.getAddress());
	}

	@Test
	public void testGetAge() {
		Passenger p1 = new Passenger("Jane Doe", "Unknown Address", 25);
		assertEquals(25, p1.getAge());
	}

	@Test
	public void testSetAge() {
		Passenger p1 = new Passenger("Jane Doe", "Unknown Address", 25);
		p1.setAge(28);
		assertEquals(28, p1.getAge());
	}

}
