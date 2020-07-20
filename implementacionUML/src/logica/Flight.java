package logica;

import java.time.LocalDate;
import java.util.ArrayList;
import logica.Airplane;

public class Flight {		
	private Airport[] codeAirport = new Airport[2];
	private ArrayList<FlightSeat> seatFlight = new ArrayList<FlightSeat>();
	private int code;
	private LocalDate fecha;
	
	public Flight(int codigo, LocalDate fecha) {
		super();
		this.code = codigo;
		this.fecha = fecha;
	}
	public int getCodigo() {
		return code;
	}
	public void setCodigo(int codigo) {
		this.code = code;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public boolean esBuscado(String ae1,String ae2, LocalDate fecha) {
		return false;
	}
	public FlightData getDataVuelo() {
		return null;
	}
	public FlightSeat getAsientoVuelo(int asiento) {
		return null;
	}
}
