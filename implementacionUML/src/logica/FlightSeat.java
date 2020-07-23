package logica;

public class FlightSeat {
	private Ticket ticket;
	private Seat seat;
	private float amount;

	public FlightSeat(Ticket ticket, Seat seat, float amount) {
		super();
		this.ticket = ticket;
		this.seat = seat;
		this.amount = amount;
	}
	
	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public boolean reservado() {
		return false;	
	}
	
	public int getNumAsiento() {
		return 0;
	}
	
	public void cancelar() {
		
	}
}
