package uk.co.airline.reservations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		Database db = new Database();
		
		db.bootstrapFlights(10);
		db.bootstrapSeats(10);
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader screenInput = new BufferedReader(new InputStreamReader(System.in));
		
		boolean appStillRunning = true;
		
		while(appStillRunning){
			
			System.out.println("What is your name?");
			
			String name = sc.nextLine();
			
			System.out.println("" +'\r'+ "");
			
			System.out.println("What is your address?");
			
			String address = sc.nextLine();
			
			System.out.println("" +'\r'+ "");
			
			System.out.println("What is your age?");
			
			int age = sc.nextInt();
			
			System.out.println("" +'\r'+ "");
			
			Passenger p1 = new Passenger(name, address, age);
			
//			boolean result = db.addPassenger(p1);
//			
//			if(result){
//				
//				System.out.println("Hello "+p1.getName()+" and thank you for flying with EverInno Airways");
//				
//			} else {
//				
//				System.out.println("Welcome back "+p1.getName()+" thanks again for choosing EverInno Airways");
			
			System.out.println("" +'\r'+ "");
			
			System.out.println(db.getFlights());
			
			System.out.println("" +'\r'+ "");
			
			System.out.println("What flight would you like?");
			
			int flightChoice = sc.nextInt();
			
			System.out.println("" +'\r'+ "");
			
			System.out.println(db.getOpenSeats(LocalDate.now(), flightChoice));
			
			System.out.println("" +'\r'+ "");
			
			System.out.println("What seat would you like?");
			
			
			System.out.println("" +'\r'+ "");
			
			
			int seatChoice = sc.nextInt();
			
			System.out.println("" +'\r'+ "");
			
			System.out.println(db.purchaseTicket(LocalDate.now(), p1, flightChoice, seatChoice));
			
			System.out.println("" +'\r'+ "");
			
			System.out.println("Would you like to purchase another ticket? (Y/N)");
			
			String startAgain = sc.next();
			
			System.out.println("" +'\r'+ "");
			
			if(startAgain == "y" || startAgain == "Y"){
						
			} else if(startAgain == "n" || startAgain == "N"){
				
			appStillRunning = false;
		
		}
	}

	}}
