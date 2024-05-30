package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// to load url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// locate userName field
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		// when v use the hyperlink
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//enter the mandatory fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nisha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anish");
		
		//dropdown DataSource choose Employee
		/*
		WebElement elemtDataSource=driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select objSelSource=new Select(elemtDataSource);
		objSelSource.selectByIndex(4); //employee
		*/
		
		//advanced Xpath
		WebElement elemtDataSource=driver.findElement(By.xpath("//option[@value='LEAD_EMPLOYEE']/parent::select"));
		Select objSelectSource= new Select(elemtDataSource);
		objSelectSource.selectByValue("LEAD_EMPLOYEE");
		
		
		//dropdown for Marketing Campaign
		/*
		WebElement elemtMarketingCamp=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select objMarketinCamp= new Select(elemtMarketingCamp);
		objMarketinCamp.selectByVisibleText("Automobile");
		*/
		
		//advanced xpath
		WebElement elemtMarketingCamp=driver.findElement(By.xpath(""));
		Select objMarketinCamp= new Select(elemtMarketingCamp);
		objMarketinCamp.selectByVisibleText("Automobile");
		
		/*
		//dropdown ownership
		WebElement elemtOwnerShip=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select objOwnership= new Select(elemtOwnerShip);
		objOwnership.selectByValue("OWN_CCORP");
		
		
		//Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		
		String viewTitle=driver.getTitle();
		if(viewTitle.contains("View Lead"))
		{
			System.out.println("Lead created successfully");
		}
		else
		{
			System.out.println("Lead not created successfully");
		}
		
		Thread.sleep(2000);
		driver.close();
		*/
	}

}
