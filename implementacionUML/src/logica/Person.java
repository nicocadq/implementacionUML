package logica;

import java.util.ArrayList;

public class Person {

	private String name;
	
	private ArrayList<Ticket> tickets;
	
	public Person(String name) {
		this.name = name;
		this.tickets = new ArrayList<Ticket>();
	}
	
	public Ticket newBooking() {
		
	}
	
	public void cancelTicket(Ticket p) {
		
	}
	
}
