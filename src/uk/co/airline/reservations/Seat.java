package uk.co.airline.reservations;

public class Seat {

	private int seatNumber;
	private SeatLevel seatLevel;

	public Seat(int seatNumber, SeatLevel seatLevel) {
		this.seatNumber = seatNumber;
		this.seatLevel = seatLevel;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public SeatLevel getSeatLevel() {
		return seatLevel;
	}

	public void setSeatLevel(SeatLevel seatLevel) {
		this.seatLevel = seatLevel;
	}
	
	
	
	public String toString(){
		//TODO implement this!
		return null;
	}
	

}
