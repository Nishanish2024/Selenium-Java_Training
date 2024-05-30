package assignment.week5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PreCondition {

	public ChromeDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser() {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// switch to iframe
		WebElement frameResult = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frameResult);
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
