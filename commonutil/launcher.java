package commonutil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launcher {
	public static String ChromedriverPath = "C:\\chromedriver_win32\\chromedriver.exe";
   // public static String launchingorangehrm="https://opensource-demo.orangehrmlive.com/";
	
	@Test
  public static WebDriver  login() throws Exception
	{

		
		WebDriver driver1;
System.setProperty("webdriver.chrome.driver",ChromedriverPath);
	driver1 =new ChromeDriver();
	driver1.manage().window().maximize() ;	
	driver1.get("https://opensource-demo.orangehrmlive.com/");

driver1.findElement(By.id("txtUsername")).sendKeys("Admin");
driver1.findElement(By.id("txtPassword")).sendKeys("admin123");
driver1.findElement(By.id("btnLogin")).click();
	
return driver1;		
	
  }

	public static Object Webdriverlogin(String chromedriverpath2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static WebDriver Webdriverlogin(Object chromedriverPath2) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
