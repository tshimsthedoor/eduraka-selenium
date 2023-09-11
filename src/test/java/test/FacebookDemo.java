package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class FacebookDemo {

	@BeforeSuite
	public void beforeSuite() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("tshimsthedor@yahoo.fr");
		driver.findElement(By.id("pass")).sendKeys("thedwer");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Test
	public void loginTest() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
