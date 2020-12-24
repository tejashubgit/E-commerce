package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	
	By login= By.xpath("/html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a");
	
	public HomePage(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement getLogin()
	{
	return driver.findElement(login);
		
	}
}
