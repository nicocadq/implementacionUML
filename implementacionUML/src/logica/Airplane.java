package logica;

import java.util.ArrayList;
import logica.FlightSeat;

public class Airplane {
	private String enrolment;
	private ArrayList<Seat> seats = new ArrayList<Seat>();

	public Airplane(String enrolment, ArrayList<Seat> seats) {
		super();
		this.enrolment = enrolment;
		this.seats = seats;
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}

	public String getEnrolment() {
		return enrolment;
	}

	public void setEnrolment(String enrolment) {
		this.enrolment = enrolment;
	}
}
