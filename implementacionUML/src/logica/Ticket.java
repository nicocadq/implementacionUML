package logica;

import java.time.LocalDate;

public class Ticket {
	
	private LocalDate date;
	private ArrayList<FlightSeat> flightSeats;
	
	public Ticket() {
		this.date = LocalDate.now();
		this.flightSeats = new ArrayList<FlightSeat>();
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public void addFlightSeat(FlightSeat fs) {
	}
	
	public float getPrice() {
		
	}
	
	public void cashPay() {
		new Cash();
	}
	
	public void cardPay(int numCard, int amountPayments) {
		new Card(numCard, amountPayments);
	}
	
	public float getFinalPrice() {
		
	}

}
