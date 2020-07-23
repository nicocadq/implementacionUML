package logica;

import java.util.ArrayList;

public class FlightData {
	private int code;
	private ArrayList<Integer> seats = new ArrayList<Integer>();
	
	public FlightData(int code, ArrayList<Integer> seats) {
		super();
		this.code = code;
		this.seats = seats;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public ArrayList<Integer> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<Integer> seats) {
		this.seats = seats;
	}
}
