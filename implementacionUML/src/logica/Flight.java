package logica;

import java.time.LocalDate;
import java.util.ArrayList;
import logica.Airplane;

public class Flight {		
	private Airport[] codeAirport = new Airport[2];
	private ArrayList<FlightSeat> seatFlight = new ArrayList<FlightSeat>();
	private int code;
	private LocalDate date;
	
	public Flight(Airport[] codeAirport, ArrayList<FlightSeat> seatFlight, int code, LocalDate date) {
		super();
		this.codeAirport = codeAirport;
		this.seatFlight = seatFlight;
		this.code = code;
		this.date = date;
	}

	public Airport[] getCodeAirport() {
		return codeAirport;
	}


	public void setCodeAirport(Airport[] codeAirport) {
		this.codeAirport = codeAirport;
	}


	public ArrayList<FlightSeat> getSeatFlight() {
		return seatFlight;
	}


	public void setSeatFlight(ArrayList<FlightSeat> seatFlight) {
		this.seatFlight = seatFlight;
	}


	public int getCode() {
		return code;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public boolean esBuscado(String ae1,String ae2, LocalDate date) {
		return false;
	}
	
	public FlightData getDataVuelo() {
		return null;
	}
	
	public FlightSeat getAsientoVuelo(int seat) {
		return null;
	}
}
