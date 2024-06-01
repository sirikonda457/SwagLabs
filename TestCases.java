package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestCases {
@Test(priority='1')
public static void testLoginLoad() {
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver","C:\\Web Browser\\geckodriver-v0.34.0-win32\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.saucedemo.com/v1/");  //given code is run successful
	driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	System.out.println("priority 1");
}
@Test(priority = '2')
public static void testLoadAbout() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/");
	System.out.println("priority 2");
}
@Test(priority = '3')
public static void testLoadProduct() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products");
	System.out.println("priority 3");
}
@Test(priority = '4')
public static void testLoadProductCross() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/cross-browser-testing");
	System.out.println("priority 4");
}
@Test(priority = '5')
public static void ProductMobileApp() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/mobile-testing");
	System.out.println("priority 5");
	
}
@Test(priority = '6')
public static void ProductErrorReporting() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/error-reporting");
	System.out.println("priority 6");
	
}
@Test(priority = '7')
public static void ProductSauceInSights() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/sauce-insights");
	System.out.println("priority 7");
	
}
@Test(priority = '8')
public static void ProductTestOrchestration() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/test-orchestration");
	System.out.println("priority 8");
	
}
@Test(priority = '9')
public static void ProductApiTesting() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/api-testing");
	System.out.println("priority 9");
	
}
@Test(priority = '0')
public static void ProductLoadCodeTest() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/low-code-testing");
	System.out.println("priority 10");
	
}
@Test (groups= {"Group 1"})
public static void ProductVisualTesting() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/visual-testing");
	System.out.println("Group 1");
}
@Test (groups= {"Group 2"})
public static void ProductSaucePerformance() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/sauce-performance");
	System.out.println("Group 2");
}
@Test (groups= {"Group 3"})
public static void ProductSupportedBrowsers() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/supported-browserd-devices");
	System.out.println("Group 3");
}
@Test (groups= {"Group 4"})
public static void ProductPlatformConfigurator() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/platform-configurator");
	System.out.println("Group 4");
}
@Test (groups= {"Group 5"})
public static void ProductDemoTours() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/demo-tours");
	System.out.println("Group 5");
}
@Test (groups= {"Group 6"})
public static void SolutionEnterprise() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/enterprise");
	System.out.println("Group 6");
}
@Test (groups= {"Group 7"})
public static void SolutionTeams() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/developers");
	System.out.println("Group 7");
}
@Test (groups= {"Group 8"})
public static void SolutionCi() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://docs.saucelabs.com/ci/");
	System.out.println("Group 8");
}
@Test (groups= {"Group 9"})
public static void SolutionDebugging() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/solutions/intelligent-software-debugging");
	System.out.println("Group 9");
}
@Test (groups= {"Group 10"})
public static void SolutionMobileBetaTesting() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/mobile-testing/apps-betas");
	System.out.println("Group 10");
}
@Test 
@Parameters({"val 1"})
public static void Pricing() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/pricing");
	
}
@Test 
@Parameters({"val 2"})
public static void DevelopersDoc () {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://docs.saucelabs.com/");
	
}
@Test 
@Parameters({"val 3"})
public static void AutomationTool() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https:/docs.saucelabs.com/basics/integrations-overview/#automation-tools");
	
}
@Test 
@Parameters({"val1 4"})
public static void DevelopversChangeLog () {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https:changelog.saucelabs.com/en");
	
}
@Test 
@Parameters({"val 5"})
public static void DevelopersMobileApp() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://docs.saucelabs.com/mobile-apps/");
	
}
@Test 
@Parameters({"val 6"})
public static void SolutionCiCd() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://docs.saucelabs.com/basics/integrations-overview/#acid-tools");
	
}
@Test 
@Parameters({"val 7"})
public static void DeveloperAppium () {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://docs.saucelabs.com/mobile-apps/automated-testing/appium/quickstart/");
	
}
@Test 
@Parameters({"val 8"})
public static void DeveloperSeleniumquickstart() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://docs.saucelabs.com/web-apps/automated-testing/selenium/quickstart/");
	
}
}
