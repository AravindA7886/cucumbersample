package cucumberrde;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;
	
	@Before
	
	public void method() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rgbvv\\eclipse-workspace\\cucumberr\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		
	}
	
	@After

	public void method2() {
		driver.close();
		driver.quit();
	}
}
