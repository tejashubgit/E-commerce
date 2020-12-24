package EndToEndPRoject;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.HomePage;
import resources.Baseone;

public class PracticeDemo extends Baseone {
	
	public WebDriver driver;
	
	@Test
	public void initialise() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		HomePage home=new HomePage(driver);
		home.getLogin().click();
	}
		
	/*@Test
	public void login()
	{
		HomePage home=new HomePage();
		home.getLogin().click();
	}*/
	}	
	
	
	

	
	
	


