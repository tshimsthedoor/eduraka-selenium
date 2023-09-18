package test;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Reporter;
import org.testng.annotations.AfterSuite;

public class FacebookDemo {
	
	WebDriver driver;
	

	@BeforeSuite
	public void beforeSuite() {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Driver_test\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void pageTitleValidation() {
		String expectedResult = "Facebook - log in or sign up";
		String actualResult = driver.getTitle().toString();
		//String actualResult="Facebook";
		
		
		System.out.println(actualResult);		
		//assertTrue(actualResult.equals(expectedResult), "Mistmatch in the page title.");
	}

	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("tshimsthedor@yahoo.fr");
		driver.findElement(By.id("pass")).sendKeys("thedwer");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String expectedResult = "Facebook";
		String actualResult = driver.getTitle().toString();
		
		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = " + actualResult);
		
		assertTrue(actualResult.equals(expectedResult), "Mistmatch in the page title.");
	}
	


	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
