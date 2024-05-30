package week2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPgm {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//to load url
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		//locate userName field
		WebElement userName= driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//when v use the hyperlink 
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
