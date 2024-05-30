package assignments.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxAutomation {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// to load url
		driver.get("https://leafground.com/checkbox.xhtml");

		//locate xpath for check box Basic label field	
		
		//Steps to click using javaScript
		// step 1  store as a WebElement
		WebElement BasicChkbox = driver.findElement(By.xpath("//input[@aria-label='Basic']"));
		/*boolean isSelected=BasicChkbox.isSelected();
		System.out.println("b4 click:  "+isSelected);
		BasicChkbox.click(); */
		
		//Steps 2 click using JS
		driver.executeScript("arguments[0].click();", BasicChkbox);
		boolean afterClick = driver.findElement(By.xpath("//input[@aria-label='Basic']")).isSelected();
		System.out.println("Basic isSelected:  " + afterClick);
		
		//locate xpath for check box Ajax label field
		WebElement chkAjax = driver.findElement(By.xpath("//input[@aria-label='Ajax']"));
		driver.executeScript("arguments[0].click();", chkAjax);
		boolean ajaxSelected = driver.findElement(By.xpath("//input[@aria-label='Ajax']")).isSelected();
		System.out.println("Ajax isSelected:  "+ajaxSelected);
		
		//choose your favorite Language check box
		//Java checkbox
		WebElement javaChk = driver.findElement(By.xpath("//label[text()='Java']"));
		driver.executeScript("arguments[0].click();", javaChk);
		boolean javaSelected = javaChk.isSelected();
		System.out.println("Java is selected: " + javaSelected);
		
		//Python checkbox
		WebElement pythonChk = driver.findElement(By.xpath("//label[text()='Python']"));
		driver.executeScript("arguments[0].click();", pythonChk);
		boolean pythonSelected=pythonChk.isSelected();
		System.out.println("Python is selected: "+ pythonSelected);
		
		
		//Tri state Checkbox
		WebElement triState = driver.findElement(By.xpath("//input[@id='j_idt87:ajaxTriState_input']"));
		driver.executeScript("arguments[0].click();", triState);
		boolean triStateSelected=triState.isSelected();
		System.out.println("Tri State selected: "+triStateSelected);
		
		//toggle Switch
		WebElement elementToggle = driver.findElement(By.xpath("//input[@name='j_idt87:j_idt100_input']"));
		driver.executeScript("arguments[0].click();", elementToggle);
		boolean toggleSelected=elementToggle.isSelected();
		System.out.println("Toggle switch selected: "+toggleSelected);
		
		//Verify if check box is disabled
		boolean disabledBtn = driver.findElement(By.xpath("//input[@aria-label='Disabled']")).isEnabled();
		System.out.println("Disabled button is enabled : " +disabledBtn);
		
		
		//select Multiple
		WebElement multiple=driver.findElement(By.id("j_idt87:multiple"));
		driver.executeScript("arguments[0].click();", multiple);
		boolean displayedMultiple = multiple.isDisplayed();
		System.out.println("multiple displayed= "+displayedMultiple);
		WebElement elemParis = driver.findElement(By.xpath("//li[@data-item-value='Paris']//div[contains(@class,'ui-state-default')]"));
	    driver.executeScript("arguments[0].click();", elemParis);
	    
		WebElement elemLondon = driver.findElement(By.xpath("//li[@data-item-value='London']//div[contains(@class,'ui-state-default')]"));
		 driver.executeScript("arguments[0].click();", elemLondon);
/*
		driver.findElement(By.xpath("//li[@data-item-value='Paris']"));
		driver.findElement(By.xpath("//li[@data-item-value='Miami']")); 
		driver.findElement(By.xpath("//li[@data-item-value='London']"));
		driver.findElement(By.xpath("//li[@data-item-value='Istanbul']"));
		driver.findElement(By.xpath("//li[@data-item-value='Berlin']"));
		driver.findElement(By.xpath("//li[@data-item-value='Barcelona']"));
		driver.findElement(By.xpath("//li[@data-item-value='Rome']"));
		driver.findElement(By.xpath("//li[@data-item-value='Brasilia']"));
		driver.findElement(By.xpath("//li[@data-item-value='Amsterdam']"));
	*/
		/*
		 * driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
        driver.findElement(By.xpath("(//label[text()='Berlin'])[2]/..//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
        //   (//label[text()='Paris'])[2]/..//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']
        driver.findElement(By.xpath("//li[@data-item-value='Paris']//div[contains(@class,'ui-state-default')]")).click();
        driver.findElement(By.xpath("//li[@data-item-value='London']//div[contains(@class,'ui-state-default')]")).click();

		 */
		
	//	driver.close();
	}

}
