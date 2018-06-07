package uk.co.airline.reservations;

import java.time.LocalDate;


public class Flight {

	private String departureCity;
	private LocalDate departureTime;
	private String arrivalCity;
	private LocalDate arrivalTime;
	private int flightNumber;
	private double price;

	public Flight(String departureCity, String arrivalCity, int flightNumber, double price) {
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.flightNumber = flightNumber;
		this.price = price;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
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

	public LocalDate getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDate departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDate getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDate arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String toString(){
		//TODO implement this!
		return null;
		
		
	}
	
	
	

}
