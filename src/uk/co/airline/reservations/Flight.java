package uk.co.airline.reservations;

import java.time.LocalDate;
import java.util.Date;

public class Flight {

	private String departureCity;
	private Date departureTime;
	private String arrivalCity;
	private Date arrivalTime;
	private int flightNumber;
	private double price;

	public Flight(String departureCity, Date departureTime, String arrivalCity, 
			Date arrivalTime, int flightNumber, double price) {
		this.departureCity = departureCity;
		this.departureTime = departureTime;
		this.arrivalCity = arrivalCity;
		this.arrivalTime = arrivalTime;
		this.flightNumber = flightNumber;
		this.price = price;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
