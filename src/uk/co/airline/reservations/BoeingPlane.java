package uk.co.airline.reservations;

import java.time.LocalDate;
import java.util.ArrayList;

public class BoeingPlane implements Plane{
	
	ArrayList<Seat> seatingPlan = new ArrayList<Seat>();
	boolean inFlight = false;
	
	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LocalDate flightTime() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Seat> getSeatingPlan() {
		return seatingPlan;
	}

	public void setSeatingPlan(ArrayList<Seat> seatingPlan) {
		this.seatingPlan = seatingPlan;
	}
	
	
	
	
	

}
