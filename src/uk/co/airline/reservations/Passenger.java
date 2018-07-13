/*
 * Passenger.java
 * author: hgobir
 */

package uk.co.airline.reservations;

public class Passenger {
	
	//fields for passengers on flight
	private String name;
	private String address;
	private int age;
	
	//constructor to create passengers
	public Passenger(String name, String address, int age){
		
		this.name = name;
		this.address = address;
		this.age = age;	
	}

	//getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return "Name of Passenger: "+this.getName() +" | Address of Passenger: "+ this.getAddress()+
				" | Age of Passenger: " + this.getAge();
	
	}
	
	

}
