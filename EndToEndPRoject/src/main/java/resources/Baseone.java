package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseone {
	public WebDriver driver;

	public Properties prop;
	public WebDriver initializeDriver() throws IOException{

	
		 prop =new Properties();
		
  FileInputStream fis =new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\EndToEndPRoject\\src\\main\\java\\resources\\data.properties");
  prop.load(fis);
  String browsername=prop.getProperty("browser");
  if (browsername.equals("chrome"))
 
  {	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");
  driver=new ChromeDriver();
  }
  else
  {
	  System.out.println("Browser not found");
	  }
  
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
		 
  
	}

}
