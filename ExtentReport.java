package seleniumassigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
  
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void extentReports() {
		// Using a relative path for the report file
		report = new ExtentReports("C:\\Users\\manis\\eclipse-workspace\\Sel_1\\report1.html");
		test = report.startTest("Amazon Search Test");
	}

	@BeforeMethod
	public void initiate() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}
	
	@Test
	void extentReport() throws InterruptedException {
		try {
			// Locate the search box and enter "Laptop"
			WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
			searchElement.sendKeys("Laptop",Keys.ENTER);
			
			// Wait for results to load
			Thread.sleep(2000);

			// Locate the first search result using your original XPath
			String actual_result = driver.findElement(By.xpath("(//*[.='jumper Laptop Computer 16 Inch, Office 365, 16GB RAM 1152GB Storage, Celeron N5095 CPU, Laptop with FHD IPS 1920x1200 Display, 38WH Battery, 2 Speakers, Mini HDMI, Numeric Keypad, Business Laptops.'])[1]")).getText();

			// Expected result (as per your original code)
			String expected_result = "jumper Laptop Computer 16 Inch, Office 365, 16GB RAM 1152GB Storage, Celeron N5095 CPU, Laptop with FHD IPS 1920x1200 Display, 38WH Battery, 2 Speakers, Mini HDMI, Numeric Keypad, Business Laptops";

			// Assert that the actual result matches expected
			Assert.assertEquals(actual_result, expected_result, "Search result does not match expected result.");

			// Log test as PASS
			test.log(LogStatus.PASS, "Search result matches expected" + expected_result);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Test failed due to exception");
		}
	}
	
	@AfterMethod
	public void endTest() {
		
		report.endTest(test);
		
		report.flush();
		
		driver.quit();
	}
}
