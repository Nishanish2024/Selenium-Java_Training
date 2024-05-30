package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTrading {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='leftmenuinnerinner']//b[text()='Stock Market']/..")).click();
		driver.findElement(By.xpath("//a[@title='Stock Lists']")).click();
		driver.findElement(By.xpath("//a[@data-value='T']")).click();
		driver.findElement(By.xpath("//a[@title='Tata Motors  Ltd - DVR Stock']")).click();
		
		String stockDetails = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']")).getText();
		System.out.println("stockDetails: "+ stockDetails);
	}

}
