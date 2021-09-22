package Selenium.ASSIGNMENT10;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignMent7 {

	@Test
	void Switching_to_a_HTML_frame()
	{
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		//Switch by Index 
		//driver.switchTo().frame(0); 
		
		//incomplete
		
		driver.quit(); 
	}
}
