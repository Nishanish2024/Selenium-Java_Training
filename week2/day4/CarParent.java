package week2.day4;

public class CarParent extends Vehicle_GParent{
	// variable ---->Properties
	String color = "Red";
	int noOfWheels = 4;
	int noOfDoors = 5;
	boolean isWorking = true;

	// methods ----> Behavior
	public void applyBrake() {
		System.out.println("Applied brake...");
	}

	public void soundHorn() {
		System.out.println("soundHorn...");
	}

	public void changeGear() {
		System.out.println("Gear changed...");
	}

	public void changeSpeed() {
		System.out.println("Speed Changed...");
	}
	
	public static void main(String Args[]) {
		CarParent poloCar= new CarParent();
		poloCar.changeSpeed();
		poloCar.openSunRoof(); //from Grand parent
		
	}
}
