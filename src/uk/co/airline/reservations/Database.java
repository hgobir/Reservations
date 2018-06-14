package uk.co.airline.reservations;

import java.util.ArrayList;

public class Database {

	private ArrayList<Seat> seats;
	private ArrayList<Passenger> passengers;
	private ArrayList<Flight> flights;
	private ArrayList<Ticket> tickets;

	public Database() {
		seats = new ArrayList<Seat>();
		passengers = new ArrayList<Passenger>();
		flights = new ArrayList<Flight>();
		tickets = new ArrayList<Ticket>();		
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public ArrayList<Flight> getFlights() {
		return flights;
	}
	
	public ArrayList<Ticket> getTickets() {
		return tickets;
	}
	
	public void addSeat(Seat seat){
		seats.add(seat);
	}
	
	public void addPassenger(Passenger passenger){
		passengers.add(passenger);
	}
	
	public void addFlight(Flight flight){
		flights.add(flight);
	}
	
	public void addTicket(Ticket ticket){
		tickets.add(ticket);
	}
	
	
	
	
	
	
	
	

	
	

}
