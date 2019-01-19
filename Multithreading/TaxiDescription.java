package com.thread.taxistand;

public class TaxiDescription {
	private int number;
	private String destination;
	private int number_of_seats_available;
	private long initiate;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumber_of_seats_available() {
		return number_of_seats_available;
	}
	public void setNumber_of_seats_available(int number_of_seats_available) {
		this.number_of_seats_available = number_of_seats_available;
	}
	public TaxiDescription(int number, String destination, int number_of_seats_available,long initiate) {
		this.number = number;
		this.destination = destination;
		this.number_of_seats_available = number_of_seats_available;
		this.initiate=initiate;
	}
	public TaxiDescription() {
		
	}
	public long getInitiate() {
		return initiate;
	}
	public void setInitiate(long initiate) {
		this.initiate = initiate;
	}
	
}
