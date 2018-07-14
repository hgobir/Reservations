package uk.co.airline.reservations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;

public class Console {

	//add html front end possibly?
	public static void main(String[] args) {

		Database db = new Database();

		db.bootstrap(5);

		// Scanner sc = new Scanner(System.in);

		BufferedReader screenInput = new BufferedReader(new InputStreamReader(System.in));
		String name = null;
		String address = null;
		String startAgain = null;
		LocalDate departureDate = LocalDate.now();
		int year = 0;
		int month = 0;
		int day = 0;
		int age = 0;
		int flightChoice = 0;
		int seatChoice = 0;

		boolean incorrectDate = true;
		boolean appStillRunning = true;

		while (appStillRunning) {

			System.out.println("What is your name?");

			// put inside while loop so user can keep trying if input is wrong
			try {

				name = screenInput.readLine();

			} catch (IOException e) {

				e.printStackTrace();
			}

			System.out.println("\nWhat is your address?");

			try {

				address = screenInput.readLine();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("\nWhat is your age?");

			try {
				age = Integer.parseInt(screenInput.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Passenger p1 = new Passenger(name, address, age);

			boolean result = db.addPassenger(p1);

			if (!result) {

				System.out.println("\nHello " + p1.getName() + " and thank you for flying with EverInno Airways");

			} else

				System.out.println("\nWelcome back " + p1.getName() + " thanks again for choosing EverInno Airways");

			
			while(incorrectDate){
				
				System.out.println("\nPlease enter which year you want to fly;");
			
				try {
					year = Integer.parseInt(screenInput.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NumberFormatException n) {
					// TODO Auto-generated catch block
					System.out.println("\nInvalid Input");
				}
				
				System.out.println("\nPlease enter which month you want to fly;");
				
				try {
					month = Integer.parseInt(screenInput.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NumberFormatException n) {
					// TODO Auto-generated catch block
					System.out.println("\nInvalid Input");
				}
				
				System.out.println("\nPlease enter which day you want to fly;");
				
				try {
					day = Integer.parseInt(screenInput.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NumberFormatException n) {
					// TODO Auto-generated catch block
					System.out.println("\nInvalid Input");
				}
					if(year < 2018 || month < 1 && month > 12 || day < 1 && day > 31){
						
						System.out.println("\nIncorrect values used for date try again!");
						
					} else 
						
						incorrectDate = false;	
					
				}
			
			departureDate = LocalDate.of(year, month, day);
			
			System.out.println("\nHere are the available flights;");

			for (Flight flightItem : db.getFlights()) {

				System.out.println(flightItem.toString());

			}

			System.out.println("\nPlease choose what flight number you wish to purchase");

			try {
				flightChoice = Integer.parseInt(screenInput.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException n) {
				// TODO Auto-generated catch block
				System.out.println("\nInvalid Input");
			}
			
//			System.out.println("\n" + db.getOpenSeats(LocalDate.now(), flightChoice));
			
			//take input and convert to departure date 
			
			System.out.println("\nHere are the available seats today on this flight;");

			ArrayList<Seat> openSeats = db.getOpenSeats(departureDate, flightChoice);
			
			for (Seat seatItem : openSeats) {

				System.out.println(seatItem.toString());

			}

			System.out.println("\nPlease choose what seat number you wish to purchase");

			try {

				seatChoice = Integer.parseInt(screenInput.readLine());

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("\nCongratulations" +p1.getName()+ " your reservation was successful!");

			
			System.out.println("\nHere is your ticket information;");

			System.out.println("\n" + db.addTicket(departureDate, p1, flightChoice, seatChoice));

			System.out.println("\nWould you like to purchase another ticket? (Y/N)");

			try {

				startAgain = screenInput.readLine();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (startAgain == "y" || startAgain == "Y") {

			} else if (startAgain == "n" || startAgain == "N") {

				appStillRunning = false;
			}

		}

	}
}

