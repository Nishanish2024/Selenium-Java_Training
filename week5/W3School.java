package assignment.week5;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class W3School extends PreCondition {

	@Test(dataProvider = "sendData")
	public void checkoutForm(String fname,String email,String adr,String city,String zip,String state,String expYear, String cvv,String expmonth,String ccnum,String cname) 
	{
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email); 
		driver.findElement(By.xpath("//input[@id='adr']")).sendKeys(adr);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zip);
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys(state);
		driver.findElement(By.xpath("//input[@id='expyear']")).sendKeys(expYear);
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys(cvv);
		driver.findElement(By.xpath("//input[@id='expmonth']")).sendKeys(expmonth);
		// credit card no
		driver.findElement(By.xpath("//input[@id='ccnum']")).sendKeys(ccnum);
		// Name on the Credit card
		driver.findElement(By.xpath("//input[@id='cname']")).sendKeys(cname);

	}
	
	@DataProvider (name= "sendData", indices = {0})
	public String[][] fetchData() throws IOException{
		
		return ReadExcelFile.readExcelData("W3School");	
	}
}
