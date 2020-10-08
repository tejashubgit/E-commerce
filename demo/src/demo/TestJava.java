package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJava {
	
	public static void main (String [] args)
	
	{
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");
		

		 WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.selenium.dev/downloads/");
	}

	
	}


