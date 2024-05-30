package assignments.day11;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceWebsite {

	public static void main(String[] args) {
		// launch the browser
				ChromeDriver driver = new ChromeDriver();
				// maximize the window
				driver.manage().window().maximize();
				// to load url
				driver.get("https://buythevalue.in/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
	}

}
