package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PreConditionMethodLogin {
	
	public ChromeDriver driver;
	
	@Parameters({"url","userName","password"})
	@BeforeMethod
	public void login(String url, String username, String pwd) {
		// launch the browser
		driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// to load url
		driver.get(url);

		// locate userName field
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		// driver.findElement(By.className("decorativeSubmit")).click();

		System.out.println("Login successfully.....");
	}
}
