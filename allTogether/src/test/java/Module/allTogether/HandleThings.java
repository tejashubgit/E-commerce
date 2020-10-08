package Module.allTogether;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleThings {
	
	
	
	@Test
	public void handleApi() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
		// To Handle Alert
		Alert a =driver.switchTo().alert();
		a.accept();
		a.dismiss();
		a.getText();
		a.sendKeys("");
		a.equals("");
		
		// To Handle Coockies
		driver.manage().getCookies();
		driver.manage().getCookieNamed("");
		
		
		//  // To Manage Waits
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  WebDriverWait wait=new WebDriverWait(driver,60);
  wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
  
  
	// To Handle Multiple Windows :
  
  Set <String> WinId=driver.getWindowHandles();
  Iterator<String> itr= WinId.iterator();
  String ParentWindow= itr.next();
  String ChiildWindow=itr.next();
  driver.switchTo().window(ParentWindow);
  driver.close();
  driver.switchTo().window(ChiildWindow);
  
  // 2nd Method to handle multiple windows using arrays
  
  Set <String> WinIds=driver.getWindowHandles();
  Iterator<String> itrs= WinId.iterator();
  ArrayList<String> ids=new ArrayList<String>();
  while(itr.hasNext()) 
  {
	  ids.add(itrs.next());
  }

	// To Handle Multiple Frames :
  
driver.switchTo().frame(driver.findElement(By.xpath("xpathExpression")));
driver.switchTo().defaultContent();
	
		

	}

}
