package katalog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
  	  @Test
	  public void testUntitledTestCase() throws Exception {
  		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
  		  
  		  
  		driver.get("https://www.google.com/search?q=orangehrm&oq=&aqs=chrome.0.69i59i450l8.4959364j0j7&sourceid=chrome&ie=UTF-8");
	    driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/div/div/a/div/cite")).click();
	    driver.findElement(By.xpath("//div[@id='divUsername']/span")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("frmLogin")).click();
	    driver.findElement(By.id("txtPassword")).click();
	   // driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
	    driver.findElement(By.id("ohrmList_chkSelectRecord_22")).click();
	    driver.findElement(By.id("btnDelete")).click();
	    driver.findElement(By.id("dialogDeleteBtn")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.id("jobTitle_jobTitle")).click();
	    driver.findElement(By.id("jobTitle_jobTitle")).clear();
	    driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Account Assistant");
	    driver.findElement(By.id("btnSave")).click();
  }
}
