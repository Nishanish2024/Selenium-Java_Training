package assignments.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// to load url
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		System.out.println("credentials entered correctly...");
		driver.findElement(By.name("login")).click();
		System.out.println("Login successfully...");
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		Thread.sleep(2000);
		
		String viewTitle=driver.getTitle();
		if(viewTitle.contains("Can't log in"))
		{
			System.out.println("Please enter your email to search for your account....");
		}
		else
		{
			System.out.println("Can't find ur account...");
		}
		System.out.println("Title of the page is verified successfully...");
		//Thread.sleep(2000);
		//driver.close();
	}
}
