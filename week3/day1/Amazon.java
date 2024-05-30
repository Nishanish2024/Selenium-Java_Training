package week3.day1;

public class Amazon extends CanaraBank implements Payments {

	public static void main(String[] args) {
		Amazon az= new Amazon();
		az.cardPayments();
		az.cashOnDelivery();
		az.internetBanking();
		az.upiPayments();
		az.recordPaymentDetails();

	}

	public void internetBanking() {
		System.out.println("Internet banking facility is available in Amazon...");
		
	}
	

}
