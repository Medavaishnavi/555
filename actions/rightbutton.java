package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class rightbutton {
 WebDriver driver;
	
	
	
	@Test
  public void launch() throws Exception
	{
 System.setProperty("windows.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
 driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	WebElement Username=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
	Actions actions=new Actions(driver);
	actions.contextClick(Username).perform();
	
	}

public WebElement findElement (By by) throws Exception
{
	WebElement elem = driver.findElement(by);  

if (driver instanceof JavascriptExecutor) 
{
 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);

}
return elem;
}





}
