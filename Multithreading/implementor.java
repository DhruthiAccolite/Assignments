package com.thread.taxistand;

import java.util.LinkedList;

public class implementor {
	public static LinkedList<TaxiDescription> taxistandvehicle = new LinkedList<>();
	public static void main(String args[]) {
		new taxi(taxistandvehicle);
		new passenger(taxistandvehicle);

	}
}
