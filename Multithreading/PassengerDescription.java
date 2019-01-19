package com.thread.taxistand;

import java.util.ArrayList;
import java.util.Random;

public class PassengerDescription {
	int number;
	String Destination;
	public PassengerDescription() {
		
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String passenger) {
		Destination = passenger;
	}

	public PassengerDescription(int i, String dest) {
		this.number=i;
		this.Destination=dest;
	}

	public String randomdestination() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");
		names.add("F");
		names.add("F");
		names.add("G");
		
		Random r = new Random();
		char index = (char) r.nextInt(names.size());
		return names.get(index);
	}
}
