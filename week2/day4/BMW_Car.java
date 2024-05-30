package week2.day4;

public class BMW_Car extends CarParent{

	int noOfAirbags=8;
	public void reverseCamera() {
		System.out.println("Reverse Camera from BMW");
	}
	public static void main(String[] args) {
		BMW_Car bmw= new BMW_Car();
		bmw.reverseCamera();
		
		//CarParent car=new CarParent(); //extends ll replace this method
		bmw.applyBrake();
		bmw.changeSpeed();
		
	}

}
