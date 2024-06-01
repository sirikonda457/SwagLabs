package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Web Browser\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	    System.out.println("login successfully");
	    String Title = driver.getTitle();
	    System.out.println("Website : "+Title);
	    WebElement titleElement = driver.findElement(By.xpath("//a[@id=\"item_4_title_link\"]"));
	    String pageTitle = titleElement.getText();
	    System.out.println("product Name : "+pageTitle);
	    WebElement currencyElement = driver.findElement(By.xpath("//div[@class=\"inventory_item_price\"]"));
	    String currency = currencyElement.getText();
	    System.out.println("Backpack : "+currency);
	    driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	    System.out.println("Add to cart");
	    driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-backpack\"]")).click();
		
	}
	

}

