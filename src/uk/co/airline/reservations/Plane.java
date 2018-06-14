package uk.co.airline.reservations;

import java.time.LocalDate;
import java.util.ArrayList;

public interface Plane {
	
	public boolean fly();
	
	public LocalDate flightTime();

	public void setSeatingPlan(ArrayList<Seat> seats);
}
