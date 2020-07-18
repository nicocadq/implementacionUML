package logica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Flight {
	private Airport airport;
	private ArrayList<FlightSeat> seatFlight = new ArrayList<FlightSeat>();
	private int codigo;
	private LocalDate fecha;
	private Airplane airplane = new Airplane();
	
	public Flight(int codigo, LocalDate fecha) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public DataFlight getDataVuelo() {
		return null;
	}
	public FlightSeat getAsientoVuelo(int asiento) {
		return null;
	}
}
