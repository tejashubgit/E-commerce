package Module.allTogether;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnabledDisplayed extends TestNg {
	public WebDriver driver;
	
	@Test
	public void enabled() 
	{
       
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=4WkYRd8ox8I");
	boolean isenabled= driver.findElement(By.xpath("//*[@id=\"button\"]/yt-icon")).isEnabled();
if(isenabled)
{ System.out.println("is enabled"); }
else
{ System.out.println("is not enabled");    
	}
}
	@Test
	public void displayed()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("https://www.youtube.com/watch?v=4WkYRd8ox8I");
			boolean isdisplayed= driver.findElement(By.xpath("//*[@id=\"button\"]/yt-icon")).isDisplayed();
		if(isdisplayed)
		{ System.out.println("is displayed"); }
		else
		{ System.out.println(" is not displayed");
			}
	}
	
	@Test
	public void isselected()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("https://www.youtube.com/watch?v=4WkYRd8ox8I");
	boolean isselected=	driver.findElement(By.xpath("//*[@id=\"native-chat-template\"]")).isSelected();
					
		if(isselected)
		{ System.out.println("is isselected"); }
		else
		{ System.out.println(" is not isselected");
			}
	}
	
	
	
}