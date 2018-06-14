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
	
	public void bootstrapSeats(Plane p1, int x){
		for(int count = 0; count < x; count++){		
			seats.add(new Seat(count, SeatLevel.PREMIUM_ECONOMY_CLASS));
		}
		 p1.setSeatingPlan(seats);
	}
	
	public void bootstrapFlights(int x){
			
		for(int count = 0; count < x; count++){
			
			String stringCount = Integer.toString(count);
			String stringFlightNumber = stringCount.concat("000");
			String stringPrice = stringCount.concat("99.99");
			
			flights.add(new Flight("Unknown Departure City", 
					"Unknown Arrival City", Integer.parseInt(stringFlightNumber), Double.parseDouble(stringPrice)));
		}
	}
	
	
	
	
	
	
	
	

	
	

}
