package com.thread.taxistand;

import java.util.LinkedList;


public class passenger implements Runnable{
    String name;
    Thread t;
    taxi ta;
    LinkedList<PassengerDescription> passengerqueue = new LinkedList<>();
    LinkedList<PassengerDescription> passengerblocked = new LinkedList<>();
    LinkedList<TaxiDescription> taxistandvehicle;
    passenger(LinkedList<TaxiDescription> taxistandvehicle) {
		this.taxistandvehicle=taxistandvehicle;
		t = new Thread(this);
		System.out.println("Creating a passenger thread");
		t.start();
	}
	public void run() {
		
		PassengerDescription pd = new PassengerDescription();
		try {
			
			for (int i = 1;; i++) {

                String dest=pd.randomdestination();
                passengerqueue.add(new PassengerDescription(i,dest));
                System.out.println("Passenger elements : "); 
                for (PassengerDescription p: passengerqueue) 
                    System.out.println(p.getNumber() + "  Destination:"+p.getDestination());
                System.out.println("Passenger Blocked elements : "); 
                    for (PassengerDescription p: passengerblocked) 
                        System.out.println(p.getNumber() + "  Destination:"+p.getDestination());
                addToTaxi();
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println(" exiting.");
    }
    public void addToTaxi(){
        for(TaxiDescription td: taxistandvehicle){
            if(td.getDestination()=="" && passengerblocked.size()>0){
                PassengerDescription firstblockedpassenger=passengerblocked.getFirst();
                td.setDestination(firstblockedpassenger.getDestination());
                td.setNumber_of_seats_available(td.getNumber_of_seats_available()+1);
                passengerblocked.removeFirst();
                LinkedList<PassengerDescription> removeListpass=new LinkedList<>();
                for(PassengerDescription pd:passengerblocked){
                    if(td.getDestination()==pd.getDestination()&& td.getNumber_of_seats_available()<4){
                        td.setNumber_of_seats_available(td.getNumber_of_seats_available()+1);
                        removeListpass.add(pd);
                    }
                }
                passengerblocked.removeAll(removeListpass);
            }
        	if(passengerqueue.size()>0) {
            PassengerDescription firstpassenger=passengerqueue.getFirst();
            if(td.getDestination()==""||td.getDestination()==firstpassenger.getDestination()&&td.getNumber_of_seats_available()<4){
                td.setDestination(firstpassenger.getDestination());
                td.setNumber_of_seats_available(td.getNumber_of_seats_available()+1);
                System.out.println("Passenger"+firstpassenger.getNumber()+"is assigned to cab"+td.getNumber());
                passengerqueue.removeFirst();
            }
            
        	}
        }
        LinkedList<PassengerDescription> removeList = new LinkedList<>();
        for(PassengerDescription p:passengerqueue){
            removeList.add(passengerqueue.getFirst());
        }
        passengerblocked.addAll(removeList);
        passengerqueue.removeAll(removeList);
    }
}

