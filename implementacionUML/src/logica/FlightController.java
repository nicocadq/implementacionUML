package logica;

import java.time.LocalDate;
import java.util.ArrayList;

public class FlightController {
	private ArrayList<Airport> airports = new ArrayList<Airport>();
	private ArrayList<Flight> flights = new ArrayList<Flight>();
	private	ArrayList<Airplane> Airplanes = new ArrayList<Airplane>();
	public int newFlight(Airport a1, Airport a2, LocalDate date) {
		return 0;

	}

	public void assignFlight(int flightCode, String enrolment) {

	}

	public ArrayList<FlightData> checkFlight(String ap1, String ap2, LocalDate date) {
		return null;

	}

	public FlightSeat getFlightSeat(int flightCode, int seat) {
		return null;

	}
}
