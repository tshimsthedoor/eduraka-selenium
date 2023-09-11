package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;





public class Base {

	public static void main(String[] args) {
		FirefoxOptions options = new FirefoxOptions();

		//options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("tshimsthedor@yahoo.fr");
		driver.findElement(By.id("pass")).sendKeys("thedwer");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.quit();
		

	}

}
