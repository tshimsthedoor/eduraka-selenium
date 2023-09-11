package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;

public class FacebookDemo {
	
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void pageTitleValidation() {
		String expectedResult = "Facebook – log in or sign up";
		String actualResult = driver.getTitle();
		
		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = " + actualResult);
		
		assertTrue(actualResult.equals(expectedResult), "Mistmatch in the page title.");
	}

	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("tshimsthedor@yahoo.fr");
		driver.findElement(By.id("pass")).sendKeys("thedwer");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	


	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
