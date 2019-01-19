package com.thread.taxistand;

import java.util.LinkedList;

public class taxi implements Runnable {
	
	LinkedList<TaxiDescription> taxiqueue = new LinkedList<>();
	LinkedList<TaxiDescription> taxistandvehicle;
	public static int max=5;
	Thread t;
	taxi(LinkedList<TaxiDescription> taxistandvehicle) {
		this.taxistandvehicle=taxistandvehicle;
		t = new Thread(this);
		System.out.println("Creating a taxi thread");
		t.start();
	}
	public void run() {
		try {
			for (int i = 1;; i++) {
				long start = System.currentTimeMillis( );
				taxiqueue.add(new TaxiDescription(i,"",0,start));
				System.out.println("Taxis waiting for stand : "); 
                for (TaxiDescription p: taxiqueue) 
                    System.out.println("Taxi No:"+p.getNumber() + "  Destination:"+p.getDestination()+" No of Seats:"+p.getNumber_of_seats_available());
				checkstand();
				Thread.sleep(8000);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println(" exiting.");
	}
	public void checkstand(){
		LinkedList<TaxiDescription> removeList = new LinkedList<>();
		for(TaxiDescription v:taxistandvehicle){
			long now = System.currentTimeMillis( );
			if(v.getNumber_of_seats_available()==4){
				System.out.println("Taxi "+v.getNumber()+"leaves the stand with "+v.getNumber_of_seats_available()+"passengers(because of passengers)");
				removeList.add(v);
			}
			if(now-v.getInitiate()>=60000){
				System.out.println("Taxi "+v.getNumber()+"leaves the stand with "+v.getNumber_of_seats_available()+"passengers(because of time)");
				removeList.add(v);
			}
		}
		taxistandvehicle.removeAll(removeList);
		while(taxistandvehicle.size()<max && taxiqueue.size()>0){
			taxistandvehicle.add(taxiqueue.removeFirst());
		}
		System.out.println("Taxi's in stand:");
		for (TaxiDescription p: taxistandvehicle) 
                    System.out.println("Taxi No:"+p.getNumber() + "  Destination:"+p.getDestination()+" No of Seats:"+p.getNumber_of_seats_available()+"is present stand");


	}
}
