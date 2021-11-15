package Emailable_Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  WebDriver driver;
	
	
	
	
	@Test
  public void launch() throws Exception
  {
 System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver_win32\\\\chromedriver.exe") ;
 driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://opensource-demo.orangehrmlive.com/");
 Reporter.log("Pass-Open Orangehrm") ;
 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
Reporter.log("pass-username");
 driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
Reporter.log("pass- password");
driver.findElement(By.id("btnLogin")).click();
Reporter.log("pass-login button");
   }
}
