package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args) {
		// launch the browser
				ChromeDriver driver = new ChromeDriver();
				// maximize the window
				driver.manage().window().maximize();
				// to load url
				driver.get("http://leaftaps.com/opentaps/control/main");

				// locate userName field
				//driver.findElement(By.xpath("//input[@id='username']/parent::p")).sendKeys("Demosalesmanager");
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				
				//driver.findElement(By.xpath("//input[@id='password']/parent::p")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

				//driver.findElement(By.xpath("//input[@class='decorativeSubmit']/ancestor::form")).click();
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				//driver.findElement(By.className("decorativeSubmit")).click();
				
				System.out.println("Login successfully.....");
				// when v use the hyperlink
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				
				//enter the mandatory fields
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nisha");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anish");
				

	}

}
