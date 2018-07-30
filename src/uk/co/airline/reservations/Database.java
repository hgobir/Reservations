package uk.co.airline.reservations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

//make subclass of database and create flights.csv file - read for file by overriding bootstrap method
public class Database {

	private ArrayList<Seat> seats;
	private ArrayList<Passenger> passengers;
	private ArrayList<Flight> flights;
	private ArrayList<Ticket> tickets;
	
	private static Logger databaseLogger = Logger.getLogger(Database.class.getName());
	private static ConsoleHandler logScreen = new ConsoleHandler();
	

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
	
	public void setLogging(){
		
		databaseLogger.addHandler(logScreen);
		databaseLogger.setLevel(Level.FINE);
		logScreen.setLevel(Level.FINEST);
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
		
		databaseLogger.info("ticket created!");
		
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
	//make subclass of db class (inheritence) override this method in subclass 
	//split each line up and store into fields in application??
	public void bootstrapCSV(){
		try {
			BufferedReader flightFile = new BufferedReader(new FileReader("C:\\Users\\Hamza\\workspace\\Reservations\\import\\destinations.csv"));
			String flightLine;
			while((flightLine = flightFile.readLine()) != null){
				//split lines into parts and assign to field in flight object
				System.out.println(flightLine);
			}
			flightFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void exportSeats(){
		try {
			BufferedWriter seatFile = new BufferedWriter(new FileWriter("C:\\Users\\Hamza\\workspace\\Reservations\\export\\seatsExport.csv"));
			for(Seat item: getSeats()){
				seatFile.write(item.toString() + "\n");				
			}			
			seatFile.close();
			System.out.println("Export file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	
	
	
	
	
	
	
	
	

	

}
