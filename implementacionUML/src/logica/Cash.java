package logica;

public class Cash extends Payment{

	private static int discount;
	
	public Cash() {
		super();
	}
	
	public static void setDiscount(int discount) {
		Cash.discount = discount;
	}
	
	public static int getDiscount() {
		return Cash.discount;
	}
	
}
