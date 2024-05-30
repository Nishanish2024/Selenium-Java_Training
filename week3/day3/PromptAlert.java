package week3.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//driver.findElement(By.xpath("//h5[text()='Alert (Prompt Dialog)']/following-sibling::button]")).click();
		Alert alert= driver.switchTo().alert();
		String inputAlert=alert.getText();
		System.out.println("Prompt Alert: "+inputAlert);
		alert.sendKeys("Nisha");
		alert.dismiss();
		
		WebElement confirmMsg=driver.findElement(By.xpath("//span[@id='confirm_result']"));
		String txtConfirm=confirmMsg.getText();
		System.out.println("Action is : "+txtConfirm);
	}

}
