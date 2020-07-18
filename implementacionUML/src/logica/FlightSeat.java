package logica;

public class FlightSeat {
	private Ticket ticket;
	private Seat seat;
	private float amount;

	public FlightSeat(float amount) {
		super();
		this.amount = amount;
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
