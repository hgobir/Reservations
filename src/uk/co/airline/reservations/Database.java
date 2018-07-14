package uk.co.airline.reservations;

import java.time.LocalDate;
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
	
	public boolean addPassenger(Passenger passenger){
		
		boolean passengerInDatabse  = false;
		
//		if(getPassengers().size() == 0){
//			
//			getPassengers().add(passenger);
//			
//		}
		
		for(Passenger passengerItem: getPassengers()){
			
			if(passengerItem.getName().equals(passenger.getName())){		
				passengerInDatabse = true;			
			}
		} if(passengerInDatabse == false){
			getPassengers().add(passenger);
		}
		return passengerInDatabse;
	}
	
	public void addFlight(Flight flight){
		flights.add(flight);
	}
	
	public ArrayList<Seat> getOpenSeats(LocalDate departureDate, int flightNumber){
		
		ArrayList<Seat> openSeats = getSeats();
		
		for(Ticket item: tickets){
			
			if(item.getDepartureDate().equals(departureDate)&& 
					item.getFlight().getFlightNumber() == flightNumber){
				
				openSeats.remove(item.getSeat());
			}		
		}		
			return openSeats;		
	}
	
	public void addTicket(Ticket t1){
		
		tickets.add(t1);
		 
	}
	
	
	public String addTicket(LocalDate departureDate, Passenger p, int flightNumber, int seatNumber){
		
		Passenger passengerOnTicket = null;
//	
//		if(getPassengers().size() == 0){		
//			getPassengers().add(p);		
//			passengerOnTicket = p;
//			
//		} else if(getPassengers().size() > 0){
//		
		for(Passenger passengerItem: getPassengers()){		
			if(p.getName().equals(passengerItem.getName())){		
//				getPassengers().add(p);
				passengerOnTicket = passengerItem;			
			}
		}
		
			
		Flight flightOnTicket = null;
			
		for(Flight flightItem : getFlights()){
			if(flightItem.getFlightNumber() == flightNumber){	
				flightOnTicket = flightItem;			
			}	
		}	
		Seat seatOnTicket = null;
			
		for(Seat seatItem: getSeats()){
				if(seatItem.getSeatNumber() == seatNumber){		
					seatOnTicket = seatItem;			
				}
			}
		Ticket ticketInDatabase = new Ticket(seatOnTicket, flightOnTicket , passengerOnTicket);
		
		ticketInDatabase.setDepartureDate(departureDate);
		
		tickets.add(ticketInDatabase);
		
		return ticketInDatabase.toString();
			
			
		}	
	
	
	public void bootstrap(int x){
		for(int count = 0; count < x; count++){		
			seats.add(new Seat(count, SeatLevel.PREMIUM_ECONOMY_CLASS));
		}
		
		for(int count = 0; count < x; count++){	
		
		String stringCount = Integer.toString(count);
		String stringFlightNumber = stringCount.concat("000");
		String stringPrice = stringCount.concat("99.99");
		
		flights.add(new Flight("Unknown Departure City", 
				"Unknown Arrival City", Integer.parseInt(stringFlightNumber), 
				Double.parseDouble(stringPrice)));
		}
	}

	

}
