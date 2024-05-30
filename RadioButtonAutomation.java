package assignments.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAutomation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(1000, null);
		Thread.sleep(2000);
		
		// Radio button -Chrome
		WebElement chromeWE= driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']"));
		chromeWE.click();
		//System.out.println("Radio button - Chrome  is clicked...");
		boolean chromeSelected = chromeWE.isSelected();
		if(chromeSelected = true)
		{
			System.out.println("Radio button- Chrome is selected...");
		}
		else
		{
			System.out.println("Radio button- Chrome is not selected...");
		}
	/*	
		// Radio button -firefox
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:1']"));

		// Radio button -Safari
		 driver.findElement(By.xpath("//label[@for='j_idt87:console1:2']"));
		
		// Radio button -Edge
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:3']"));

		// Radio Button for Unselectable
		// Radio button- Chennai
		driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']"));

		// Radio button- Bangalore
		driver.findElement(By.xpath("//label[@for='j_idt87:city2:1']"));
*/
		// Radio button- Hyderabad
		WebElement HydElement = driver.findElement(By.xpath("//label[@for='j_idt87:city2:2']"));
		HydElement.click();
		System.out.println("City Hyderabad is selected...");
		
		//Identify the radio button that is initially selected by default
		WebElement safariWE = driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
		if(safariWE.isEnabled())
		{
			System.out.println("Safari is selected by default");
		}
		else {
			System.out.println("Nothing selected by default");
		}
		
		//Check and select the age group (21-40 Years) if not already selected
		WebElement ageElement = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		if(ageElement.isEnabled()) {
			System.out.println("age group (21-40 Years) is selected");
		}
		else
		{
			System.out.println("age group (21-40 Years) is not selected");
			ageElement.click();
		}
		
		//driver.close();
	}

}
