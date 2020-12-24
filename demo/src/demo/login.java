package demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login extends TestJava {
	
	@Test
	public void loginSystem()
	{
	
driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		//Login
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("tejasjadhav8888@gmail.com");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
	}

}
