package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo1 {
 WebDriver driver;
	
	
	@Test
  public void launch() throws Exception
	{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://javascript.info/alert-prompt-confirm");
	driver.findElement(By.linkText("Run the demo")).click();
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("vysh");
	
	Thread.sleep(3000);
	
	alert.dismiss();
	
	Thread.sleep(3000);
	alert.accept();
	}	
	
	
	
	
	
	
	
	
	}

