package Selenium.ASSIGNMENT10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ASSIGNMENT8 {
	
	@Test
	void Identifying_and_Switching_to_a_pop_up_window()
	{
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		/*// 1: Launch the URL: https://the-internet.herokuapp.com/javascript_alerts
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// 2: Click on the “Click for JS Alert”.
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
	    Alert alert = driver.switchTo().alert();
		// 3. Click on OK button  

	    driver.switchTo().alert().accept();
	   //  3: Verify that message “You successfully clicked an alert
*/	
		driver.get("https://book.spicejet.com/search.aspx");
		driver.manage().timeouts().getImplicitWaitTimeout();
        driver.findElement(By.xpath("//label[@class='selected-label']")).click();
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.linkText(" Pune (PNQ)")).click();
        driver.findElement(By.linkText(" Goa (GOI)")).click();
	}
   
}
