
package Selenium.ASSIGNMENT10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	@Test
	void xPathPractice() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		Thread.sleep(3000);
		// Launch the URL:
		driver.get("https://book.spicejet.com/search.aspx");

	     driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
	      driver.findElement(By.xpath("//a[text()=' Pune (PNQ)']")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[text()=' Goa (GOI)']")).click();
	    
		// DEPART DATE
		Thread.sleep(3000);
		driver.findElement(By.id("custom_date_picker_id_1")).click();
		Thread.sleep(3000);
		String month = driver.findElement(By.xpath("//div[@class = 'ui-datepicker-group ui-datepicker-group-first'] //span[@class='ui-datepicker-month']")).getText();
		System.out.println("Month is : " + month);
		Thread.sleep(3000);
		String year = driver.findElement(By.xpath("//div[@class = 'ui-datepicker-group ui-datepicker-group-first'] //span[@class='ui-datepicker-year']")).getText();
		System.out.println("Year is : " + year);

		while (!(month.equals("November") && year.equals("2021")))
		{
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last'] //a[@class='ui-datepicker-next ui-corner-all']")).click();
			 year = driver.findElement(By.xpath("//div[@class = 'ui-datepicker-group ui-datepicker-group-first'] //span[@class='ui-datepicker-year']")).getText();
		     month = driver.findElement(By.xpath("//div[@class = 'ui-datepicker-group ui-datepicker-group-first'] //span[@class='ui-datepicker-month']")).getText();
			System.out.println("month is : " + month);
			System.out.println("year is : "+ year);
		}
		//driver.findElement(By.xpath("//div[@class = 'ui-datepicker-group ui-datepicker-group-first'] //a[@class='ui-state-default ui-state-active']")).click();

		
		
	}
}