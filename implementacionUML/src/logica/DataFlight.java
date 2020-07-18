package logica;

import java.util.ArrayList;

public class DataFlight {
	private int codigo;
	private ArrayList<Integer> asientos = new ArrayList<Integer>();
	public DataFlight(int codigo, ArrayList<Integer> asientos) {
		super();
		this.codigo = codigo;
		this.asientos = asientos;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public ArrayList<Integer> getAsientos() {
		return asientos;
	}
	public void setAsientos(ArrayList<Integer> asientos) {
		this.asientos = asientos;
	}
}
