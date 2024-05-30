package assignments.day13;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailWebTable {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://erail.in/");
		
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS");
		
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU");
		//unchecking the date box
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//get the trains button
		driver.findElement(By.id("buttonFromTo")).click();
		
		//web table
	/*
		WebElement trains = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		String trainDetails = trains.getText();
		System.out.println("trainDetails: "+trainDetails);
	*/	
		
		int noOfRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr")).size();
		System.out.println("noOfRows: "+ noOfRows);
		
		/*
		//for(int i=2 ;i <= noOfRows; i++) {
		for(int i=2 ;i <= 15; i++) {
			String trainNames = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println("Row"+ i + "  " + trainNames);
		}
		*/
	
		Set<String> dupList = new LinkedHashSet<String>();
		for(int i = 2; i <= 15 ; i++) {
			String eachTrain = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			//System.out.println("eachTrain: " + eachTrain);
			dupList.add(eachTrain);	 
		}
		
		Thread.sleep(2000);
		
		for(int i=2; i <= 15 ; i++) {
			WebElement listOfTrains = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]"));
			String trainTxt = listOfTrains.getText();
			dupList.add(trainTxt);	
			System.out.println("Row"+i +" trainTxt: "+trainTxt);
			for (int j= 0; j< dupList.size() ;j++) {
				if(dupList.contains(trainTxt)) {
					//System.out.println("Duplicates..." + dupList.toString());
					dupList.remove(j);
				}
			}
		}
		System.out.println("Train List: " + dupList);
		
	}

}
