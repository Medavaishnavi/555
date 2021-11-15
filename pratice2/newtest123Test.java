package pratice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newtest123Test {
  WebDriver driver;
	
	
	@Test
  public void f() throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		//open orangehrm
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("wrapper")).sendKeys("Admin");
  
  
  
  }
}
