package week5.day1.excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends PreConditionMethodLogin{

	@Test(dataProvider = "sendData")
	public void runCreateLead(String cname, String fname, String lname, String phno) throws IOException {
			
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click(); 

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
	/*	
		//To take a screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		//Which location i want to store the screenShot
		File des = new File("E:/Testleaf/Screenshots_EclipseProjects/ViewLead.jpg");//png. jpg, jpge
		// Copy the screenshot into the file location
		FileUtils.copyFile(src, des);
		
		WebElement viewLeadWE = driver.findElement(By.xpath("//div[@id='center-content-column']"));
		
		File src1 = viewLeadWE.getScreenshotAs(OutputType.FILE);
		File des1 = new File("./snaps/ViewLeadWE.png");
		FileUtils.copyFile(src1, des1);
		*/
}
	// Incides wil starts from zero , to access particular data from data provider
	@DataProvider( name = "sendData", indices = {0})
	public String[][] fetchData() throws IOException {
		/*String[][] data = new String[3][4];// 1st dimension as row size and 2nd dimension as column size
		
		data[0][0] = "Testleaf";
		data[0][1] = "gokul";
		data[0][2] = "Sekar";
		data[0][3] = "99";
		
		
		data[1][0] = "qeagle";
		data[1][1] = "babu";
		data[1][2] = "m";
		data[1][3] = "98";
		
		data[2][0] = "Testleaf";
		data[2][1] = "hari";
		data[2][2] = "r";
		data[2][3] = "97";
		
		return data;*/
		
		return ReadExcelData.excelData("CreateLead");// To call static method ClassName.methodName
	}
	
	
	

}
