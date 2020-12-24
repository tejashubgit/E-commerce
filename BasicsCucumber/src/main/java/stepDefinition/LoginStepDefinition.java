package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	
	WebDriver driver;
	
	@Given(" ^User is already on Home page$")
	public void User_is_already_on_Home_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

	}
	
	
	@When(" ^title of login page is amazon.in$")
	public void title_of_login_page_is_amazon ()
	{
		String title= driver.getTitle();
		System.out.println(title);
	//	Assert.assertEquals(expected, actual);
		
	}
	
	@Then (" ^click on login button$")
	public void click_on_login_button()
	{
		
		driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]/span[1]")).click();
	}
	
}
