package logica;

import java.time.LocalDate;

public class Ticket {
	
	private LocalDate date;
	
	public Ticket() {
		this.date = LocalDate.now();
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public void addFlightSeat(FlightSeat fs) {
		
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
