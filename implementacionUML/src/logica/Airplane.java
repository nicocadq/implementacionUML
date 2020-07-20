package logica;

import java.util.ArrayList;
import logica.FlightSeat;

public class Airplane {
	private String enrolment;
	private ArrayList<Seat> seats = new ArrayList<Seat>();

	public Airplane(String enrolment) {
		super();
		this.enrolment = enrolment;
	}

	public String getEnrolment() {
		return enrolment;
	}

	public void setEnrolment(String enrolment) {
		this.enrolment = enrolment;
	}
	
}
