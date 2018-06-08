package uk.co.airline.reservations;

import java.time.LocalDate;
import java.util.ArrayList;

public interface Plane {
	
	ArrayList<Seat> seatingPlan = new ArrayList<Seat>();
	boolean inFlight = false;
	
	public boolean fly();
	
	public LocalDate flightTime();

}
