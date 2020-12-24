package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TestJava {
	public WebDriver driver;

	@BeforeTest
	public void initialiseDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@Test
	public void hitUrl()
	{
		

		driver.get("http://automationpractice.com/index.php");
		Reporter.log("hiting automation practice site", true);
		

	}
	

	@Test
	public void titleValidation()
	{
		String title=driver.findElement(By.xpath("//*[@id=\"home-page-tabs\"]/li[2]/a")).getText();
		Assert.assertEquals(title, "BEST SELLERS", "Not matiching actual result");
			Reporter.log("Validating navigatio title", true);
		
	}
	
	@Test(groups= {"sanity"})
	public void login() throws IOException
	{
driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		//Login
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("tejasjadhav8888@gmail.com");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
	}
	
	
	
	@Test
	public void getScreenshot() throws IOException
	{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String destinationFile=System.getProperty("C:\\Users\\Admin\\eclipse-workspace\\demo\\ScreenShots");
	Files.copy(src, new File(destinationFile));
	}
	
	
	@AfterTest
	public void tearDown() 
	{
		driver.close();
	}
}


