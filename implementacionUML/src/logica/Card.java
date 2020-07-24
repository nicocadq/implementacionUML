package logica;

public class Card extends Payment{
	
	private int num;
	private int[] amountPayments = new int[] {1, 2, 3};
	private int payments;
	
	public Card(int num, int amountPayments) {
		this.num = num;
		this.payments = this.amountPayments[amountPayments - 1];
	}	
	
	public int getNum() {
		return this.num;
	}
	
	public int getPayments() {
		return this.payments;
	}
	
}
