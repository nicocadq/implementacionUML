package logica;

public class Payment {
	
	private PaymentStatus paymentStatus;
	
	public Payment() {
		this.paymentStatus = PaymentStatus.PENDING;
	}
	
	public void setPaymentStatusPAYOUT() {
		this.paymentStatus = PaymentStatus.PAYOUT;
	}
	
	public void setPaymentStatusPENDING() {
		this.paymentStatus = PaymentStatus.PENDING;
	}
	
}
