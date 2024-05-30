package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditLead extends PreConditionMethodLogin{
	
	@Test
	public void edit() throws InterruptedException {
		//accessing the hyperlink CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		// enter the mandatory fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nisha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anish");

		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Nishapc");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Creating Lead for testing purpose");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("pcnisha@gmail.com");
		WebElement state = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dropdwnState = new Select(state);
		dropdwnState.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).submit();
		System.out.println("Lead is created successfully...");

		Thread.sleep(2000);
		// Edit lead
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// clear the description field
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']"))
				.sendKeys("the newly created record is updated");
		driver.findElement(By.xpath("//input[@value='Update']")).submit();
		System.out.println("Updated successfully...");

		String title = driver.getTitle();
		System.out.println("Title of the Page is: " + title);
	}
}
