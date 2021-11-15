package anusha;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class With_DataProvidersExcelApi_Static3 {
	static WebDriver driver;
	 
	@DataProvider(name="friend")
public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx", "Sheet1");
		System.out.println(testObjArray.length);
		return (testObjArray);
	
	}
  @Test(dataProvider="friend")
  public  void Jobstest(String TestURL,String User,String Password,String skillname,String skilldescr) throws Exception {
		
	  With_DataProvidersExcelApi_Static3 T2 = new With_DataProvidersExcelApi_Static3();
		T2.OpenChromeBrowser();
		T2.OpenOrangeHRM(TestURL);
		T2.Login(User,Password);
		T2.Admin_Qualifications(skillname,skilldescr);
  }
  public  void OpenChromeBrowser()throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
  }
  public  void OpenOrangeHRM(String TestURL)throws Exception {
		driver.get(TestURL);
  }
  public  void Login(String User,String Password)throws Exception {
	  findElement(By.cssSelector("input#txtUsername")).sendKeys(User);
		findElement(By.cssSelector("input#txtPassword")).sendKeys(Password);
	findElement(By.id("btnLogin")).click();
  }
  public  void Admin_Qualifications(String skillname,String skilldescr) throws Exception {
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys(skillname);
		findElement(By.id("skill_description")).sendKeys(skilldescr);
		//driver.findElement(By.className("required")).sendKeys("Oracle");
		findElement(By.id("btnSave")).click();		
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
