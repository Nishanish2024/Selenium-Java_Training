package assignments.day9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// to load url
		driver.get(" https://www.ajio.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@aria-label='search']")).submit();
		
		Thread.sleep(2000);
		//choose gender-Men
		WebElement gender = driver.findElement(By.xpath("//input[@id='Men']"));
		driver.executeScript("arguments[0].click();", gender);
		System.out.println("gender has choosen as men....");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@for,' Fashion Bags')]")).click();
		
		WebElement products = driver.findElement(By.xpath("//div[@class='length']"));
				//div[@id='products']"));
		System.out.println("products: "+products.getText());
		
		//list of brands
		List<String> brandList = new ArrayList<String>();
		
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		int size =brands.size();
		System.out.println("no of Brands: " + size);
		
		for(int i=0; i<size; i++) {
			WebElement brandName =brands.get(i);
			brandList.add(brandName.getText());
		}
		
		System.out.println("Available brands are:" +brandList);
		
		//lists of names of the bags
		List<String> bagNamesEach= new ArrayList<String>();
		List<WebElement> bagNamesList= driver.findElements(By.xpath("//div[@class='nameCls']"));
		int sizeBagList = bagNamesList.size();
		for(int i=0; i< sizeBagList; i++) {
			WebElement name = bagNamesList.get(i);
			bagNamesEach.add(name.getText());	
		}
		System.out.println("Bag Names: " + bagNamesEach);
	}

}
