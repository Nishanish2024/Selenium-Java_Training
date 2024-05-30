package week4.day3;

import org.testng.annotations.Test;

public class learnAttributes {
	
	@Test(invocationCount = 5 ,invocationTimeOut = 2000)
	public void Create() {
		System.out.println("Created successfully...");
	}
	
	@Test
	public void Edit() {
		System.out.println("Edited successfully...");
	}
	
	@Test
	public void Delete() {
		System.out.println("Deleted successfully...");
	}
}
