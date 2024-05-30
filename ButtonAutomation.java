package assignments.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;


public class ButtonAutomation {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		
		//Click on the button with the text ‘Click and Confirm title
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		
		String title= driver.getTitle();
		if(title.contains("dashboard"))
		{
			System.out.println("Verified that the title of the page has dashboard");
		}
		else
		{
			System.out.println("the title of the page does not contains dashboard");
		}
		
		driver.navigate().back();
		
		//Confirm if the button is disabled
		boolean enableBtn= driver.findElement(By.name("j_idt88:j_idt92")).isEnabled();
		System.out.println("Confirm if the button is Enabled= "+ enableBtn);
		
		//Find and print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.name("j_idt88:j_idt94")).getLocation();
		System.out.println("the position of the button with the text 'Submit': " + location);
		
		//Find the Save button color"'
		String color= driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println("background Color of the save button= "+ color);
		
		//Find the height and width of this button
		Dimension size=driver.findElement(By.name("j_idt88:j_idt94")).getSize();
		System.out.println("Height & width of Submit button= "+size);
		
		//close the browser
		//driver.close();
	}

}
