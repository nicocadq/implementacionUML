package logica;

import java.time.LocalDate;

public class Ticket {
	
	private LocalDate date;
	
	private Person person;
	
	public Ticket() {
		this.date = LocalDate.now();
	}
	
	public void addFlightSeat(FlightSeat fs) {
		
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Person getPerson() {
		return this.person;
	}
	
	public float getPrice() {
		
	}
	
	public void cashPay() {
		
	}
	
	public void cardPay() {
		
	}
	
	public float getFinalPrice() {
		
	}

}
