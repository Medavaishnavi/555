package AAA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parameters {
 WebDriver Driver;
String Browser="https://opensource-demo.orangehrmlive.com/";
String Username="Admin",Password="admin123";

	
	
	@Test
  public void parameters1() throws Exception
	{
  parameters P= new parameters();
  P.Openchromebrowser();
  P.Openorangehrm(Browser);
  P.Login(Username,Password);
  	
	
	
	}




	

	public void Openchromebrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		Driver =new ChromeDriver();
		Driver.manage().window().maximize() ;	
  }
	public void launch (String Browser1) throws Exception
	{
		Driver.get("Brower");
		
	}	
	public void Login(String Username, String Password) throws Exception 
	{
		Driver.findElement(By.id("txtUsername")).sendKeys(Username);
		Driver.findElement(By.id("txtPassword")).sendKeys(Password);
		Driver.findElement(By.id("btnLogin")).click();
		
	}
	






}










}
