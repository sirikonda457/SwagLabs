package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class OrangeTestCases {
	
@Test
	public static void testLogin() {

   WebDriver driver;
   System.setProperty("webdriver.gecko.driver","C:\\Web Browser\\geckodriver-v0.34.0-win32\\geckodriver.exe");
   driver = new FirefoxDriver();
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
   driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
   driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();

 }
}
