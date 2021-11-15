package testng_parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testingstaticparameter {
 static WebDriver driver;
	

@Parameters({"Username","Password","skillname","skilldesc"})
@Test
  public  static void launch(String Username,String Password,String skillname,String skilldesc)throws Exception
{
  
		
	 	
	 	testingstaticparameter.Openchromebrowser();
	 	testingstaticparameter.openOrangeHRM();
	 	testingstaticparameter.login(Username,Password);
	 	testingstaticparameter.addskillname(skillname,skilldesc);
	 	//testingstaticparameter.addskilldesc();
       // driver.quit();
}


public static void Openchromebrowser() throws Exception
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
 	driver =new ChromeDriver();
	 	driver.manage().window().maximize();
		
	
}


public static void openOrangeHRM ()throws Exception
 {
	 driver.get("\"https://opensource-demo.orangehrmlive.com/");
}
public static void login (String UserName,String Password)throws Exception{
	driver.findElement(By.id("txtUsername")).sendKeys(UserName);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	driver.findElement(By.id("btnLogin")).click();
	}
public static void addskillname(String skillname, String skilldesc)throws Exception
{
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	driver.findElement(By.id("menu_admin_Qualifications")).click();
	driver.findElement(By.id("menu_admin_viewSkills")).click();
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.id("skill_name")).sendKeys(skillname);
	driver.findElement(By.id("skill_description")).sendKeys(skilldesc);
	driver.findElement(By.id("btnSave")).click();

}

}
