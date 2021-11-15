package orange123.orange123;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  private Object indian123;

@Test
  public void Login() throws Exception
  {
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize() ;
		//open orangehrm
		Driver.get("https://www.flipkart.com/");
		/*
       // Driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     //   Driver.findElement(By.name("txtPassword")).sendKeys("admin123");
       // Driver.findElement(By.id("btnLogin")).click();
       // Driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        Driver.findElement(By.linkText("Nationalities")).click();
        Driver.findElement(By.id("btnAdd")).click();
        Driver.findElement(By.id("nationality_name")).sendKeys("korea");
       */
        
        
  }
  
  
  
  
  
  
}
