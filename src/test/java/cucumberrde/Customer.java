package cucumberrde;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Customer<Map> {
	
	@Given("The user should be in telecom page and click")
	public void the_user_should_be_in_telecom_page_and_click() {

	   Hooks. driver.get("https://demo.guru99.com/telecom/");
	   Hooks. driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}
/*
	@When("The user should provide valid details {string},{string},{string},{string},{string}")
	public void the_user_should_provide_valid_details(String fname, String lname, String email, String address, String phone) {
	 driver.findElement(By.xpath("//label[text()='done']")).click();  
	 driver.findElement(By.id("fname")).sendKeys(fname);
	 driver.findElement(By.id("lname")).sendKeys(lname);
	 driver.findElement(By.id("email")).sendKeys(email);
	 driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(address);
	driver.findElement(By.id("telephoneno")).sendKeys(phone);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
*/
	/*
	@When("The user should provide valid details")
	public void the_user_should_provide_valid_details(io.cucumber.datatable.DataTable onelist) {
		
	
		java.util.List<String> oned= onelist.asList();
		driver.findElement(By.xpath("//label[text()='Done']")).click();  
		 driver.findElement(By.id("fname")).sendKeys(oned.get(0));
		 driver.findElement(By.id("lname")).sendKeys(oned.get(1));
		 driver.findElement(By.id("email")).sendKeys(oned.get(2));
		 driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(oned.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(oned.get(4));
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   
	}
	*/
	
/*	@When("The user should provide valid details")
	public void the_user_should_provide_valid_details(io.cucumber.datatable.DataTable twomap) {
		java.util.List<java.util.Map<String, String>> as= twomap.asMaps(String.class,String.class); 
		driver.findElement(By.xpath("//label[text()='Done']")).click();  
		 driver.findElement(By.id("fname")).sendKeys(as.get(0).get("fname"));
		 driver.findElement(By.id("lname")).sendKeys(as.get(0).get("lname"));
		 driver.findElement(By.id("email")).sendKeys(as.get(0).get("email"));
		 driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(as.get(0).get("address"));;
		driver.findElement(By.id("telephoneno")).sendKeys(as.get(0).get("phone"));;
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   
	    
	}
	*/

@When("The user should provide valid details")
public void the_user_should_provide_valid_details(io.cucumber.datatable.DataTable onemap) {
	java.util.Map<String, String> ond = onemap.asMap(String.class, String.class);
	Hooks.driver.findElement(By.xpath("//label[text()='Done']")).click();  
	Hooks. driver.findElement(By.id("fname")).sendKeys(ond.get("fname"));
	Hooks. driver.findElement(By.id("lname")).sendKeys(ond.get("lname"));
	Hooks. driver.findElement(By.id("email")).sendKeys(ond.get("email"));
	Hooks. driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(ond.get("address"));
	Hooks.driver.findElement(By.id("telephonen")).sendKeys(ond.get("phone"));
	Hooks.driver.findElement(By.xpath("//input[@value='Submit']")).click();
  
}

	
	
	
	
	
	
	
	
	@Then("The user validate details")
	public void the_user_validate_details() {
		Assert.assertTrue(Hooks.driver.findElement(By.xpath("//input[@align='center'])[2]")).isDisplayed());
	}
}    




