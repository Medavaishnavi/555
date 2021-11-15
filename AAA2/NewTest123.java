package AAA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import commonutil.launcher;

public class NewTest123 {
  WebDriver driver;
	
	@Test
  public void browse() throws Exception

	{
  driver=launcher.login();
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	driver.findElement(By.id("menu_admin_Job")).click();
	driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
	driver.findElement(By.id("ohrmList_chkSelectRecord_2")).click();
	driver.findElement(By.id("btnDelete")).click();
	driver.findElement(By.id("dialogDeleteBtn")).click();
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Chief Financial Officer");
	driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Finance");
	driver.findElement(By.id("btnSave")).click();
	//driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
}
