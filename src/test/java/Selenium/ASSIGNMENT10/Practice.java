
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Practice 
{
	WebDriver driver;
	@DataProvider(name = "login_Credentials")
	public static Object[][] DataSet()
	{
	   Object[][] obj =
	   { 
		  { "Rohit@123", "Rohit", "Software Tester" }, 
		/*{ "wrongName", "WrongPassword", "WrongProfile" } */
	    };
		return obj;
	}

	@BeforeSuite  
	 public void before_suite()  
	 {  
	     System.out.println("First method");  
	 } 
	
	@Test(dataProvider = "login_Credentials")
	public void DataProvSampleTest(String type, String username, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();

		if (type.equals("Rohit")) 
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='title']")));
		} else
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-test='error']")));

		Thread.sleep(2000);
		driver.quit();
	}
}