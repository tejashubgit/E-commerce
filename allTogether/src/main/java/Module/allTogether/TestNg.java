package Module.allTogether;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestNg {
	
	static WebDriver driver;
	
	public static void  main (String[] args)
	{

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		//Login
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("tejasjadhav8888@gmail.com");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
	// Mousehover women
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"))).build().perform();
		
		//click on t-shirts
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();
		
		// mousehover image
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span")).click();
		
		//increase quantity to 2
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
		Select sec =new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
		sec.selectByVisibleText("L");
		
		//Select colour
		driver.findElement(By.xpath("//*[@id=\"color_14\"]")).click();
		
		//add to cart
		
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
	
   
	}}
