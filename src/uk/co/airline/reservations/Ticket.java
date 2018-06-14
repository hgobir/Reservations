package uk.co.airline.reservations;

import java.time.LocalDate;

public class Ticket {
	
	private LocalDate departureDate;
	private Seat seat;
	private Flight flight;
	private Passenger passenger;

	public Ticket(){
		departureDate = LocalDate.now();
	}
	
	public Ticket(Seat seat, Flight flight, Passenger passenger){
		departureDate = LocalDate.now();
		this.seat = seat;
		this.flight = flight;
		this.passenger = passenger;
		
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	
	
	
	
	
	
	
	
	
	

}
