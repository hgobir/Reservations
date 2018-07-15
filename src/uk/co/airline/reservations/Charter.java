package uk.co.airline.reservations;

import java.time.LocalDateTime;

public class Charter extends Flight {

	private LocalDateTime departureDateTime;

	public Charter(String departureCity, String arrivalCity, int flightNumber, double price, String departureDateTime) {
		super(departureCity, arrivalCity, flightNumber, price);
		setDepartureDateTime(departureDateTime);
	}

	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = LocalDateTime.parse(departureDateTime);
	}
	
	public String toString(){
		return "Departure City: "+this.getDepartureCity() + " | Arrival City: "+ this.getArrivalCity() 
		+ " | Price of Flight: " + this.getPrice() + " | Flight Number: "+this.getFlightNumber()+
		" | Date of Flight: " + this.getDepartureDateTime().toLocalDate() + " | Time of Flight: "+this.getDepartureDateTime().toLocalTime();
	}

}
