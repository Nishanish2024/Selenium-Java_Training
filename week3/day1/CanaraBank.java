package week3.day1;

public abstract class CanaraBank implements Payments {
	
	public void cashOnDelivery() {
		System.out.println("Cash on delivery costs u extra 100..");
	}
		
	public void upiPayments() {
		System.out.println("UPI payments are available");
	}
	public void cardPayments() {
		System.out.println("Card payments are available");
	}
	
	public void recordPaymentDetails() {
		System.out.println("Payment recording ....in CANARA Bank");
	}


}
