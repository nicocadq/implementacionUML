package logica;

import java.time.LocalDate;
import java.util.ArrayList;
import logica.FlightSeat;

public class FlightController {
	private ArrayList<Airport> airports = new ArrayList<Airport>();
	private ArrayList<Flight> flights = new ArrayList<Flight>();
	private	ArrayList<Airplane> airplanes = new ArrayList<Airplane>();

	public FlightController(ArrayList<Airport> airports, ArrayList<Flight> flights, ArrayList<Airplane> airplanes) {
		super();
		this.airports = airports;
		this.flights = flights;
		airplanes = airplanes;
	}
	
	public ArrayList<Airport> getAirports() {
		return airports;
	}

	public void setAirports(ArrayList<Airport> airports) {
		this.airports = airports;
	}

	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}

	public ArrayList<Airplane> getAirplanes() {
		return airplanes;
	}

	public void setAirplanes(ArrayList<Airplane> airplanes) {
		airplanes = airplanes;
	}
	
	public int newFlight(Airport a1, Airport a2, LocalDate date) {
		return 0;
		
	}

	public void assignFlight(int flightCode, String enrolment) {

	}

	public ArrayList<DataFlight> checkFlight(String ap1, String ap2, LocalDate date) {
		return null;

	}

	public FlightSeat getFlightSeat(int flightCode, int seat) {
		return null; //tiene que retornar en un futuro una instancia de FlightSeat

	}
}
