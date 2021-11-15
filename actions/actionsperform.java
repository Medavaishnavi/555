package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionsperform {
 WebDriver driver;
	
	
	@Test
  public void login() throws Exception
	{
 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
 driver=new ChromeDriver();
driver.manage().window().maximize();	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    	driver.findElement(By.id("btnLogin")).click();
	
    	WebElement PIM=driver. findElement (By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
    	WebElement Configuration= driver.findElement(By.xpath("//*[@id='menu_pim_Configuration']"));
    	//WebElement Configuration= findElement(By.xpath("//*[@id='menu_pim_Configuration']"));
		
		Actions actions = new Actions(driver); 	 
	  
		actions.moveToElement(PIM).
		moveToElement(Configuration).click().build().perform();
	
	
	}
	 public  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

}
	