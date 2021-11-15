package anusha;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest_Static {
	static WebDriver driver;
	
  @Test
  public static void Jobstest() throws Exception {
		
	  NewTest_Static.OpenChromeBrowser();
	  NewTest_Static.OpenOrangeHRM();
	  NewTest_Static.Login();
	  NewTest_Static.Admin_Qualifications();
  }
  public static void OpenChromeBrowser()throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
  }
  public static void OpenOrangeHRM()throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  public static void Login()throws Exception {
	  findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
  }
  public static void Admin_Qualifications() throws Exception {
	   findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys("cde");
		findElement(By.id("skill_description")).sendKeys("Programming Language");
		//driver.findElement(By.className("required")).sendKeys("Oracle");
		findElement(By.id("btnSave")).click();		
	}
  public static WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}

    
  
}
