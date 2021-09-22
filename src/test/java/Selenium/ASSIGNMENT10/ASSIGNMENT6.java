package Selenium.ASSIGNMENT10;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ASSIGNMENT6 {

	public class AssignMent7 {

	@Test
	void Reading_data_from_Excel_for_below_pplication()
	{
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
WebDriverWait wait;
HSSFWorkbook workbook;
HSSFSheet sheet;
HSSFCell cell;

driver.manage().window().maximize(); 

wait = new WebDriverWait(driver,30); 

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

// Import excel sheet. 

File src=new File("C:\\Users\\Admin\\Desktop\\TestData.xls"); 

// Load the file. 

FileInputStream finput = new FileInputStream(src); 

// Load the workbook. 

workbook = new HSSFWorkbook(finput); 

// Load the sheet in which data is stored. 

sheet= workbook.getSheetAt(0); 

for(int i=1; i&lt;=sheet.getLastRowNum(); i++) { 

// Import data for Email. 

cell = sheet.getRow(i).getCell(1); 

cell.setCellType(Cell.CELL_TYPE_STRING); 

driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue()); 

// Import data for password. 

cell = sheet.getRow(i).getCell(2); 

cell.setCellType(Cell.CELL_TYPE_STRING); 

driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue()); 

} 

}

	}
}}}