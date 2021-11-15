package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Day_028_WebTable_Examples.ExportEmployees;
import ExcelUtil.ExcelApiTest3;
import ExcelUtil.ExcelApiTest4;

public class jobstable {
// private static final String i = null;
//private static final String k = null;
WebDriver driver;
 public int iRow;
	
	
	@Test
  public void tableofjobs ()  throws Exception
	{
 System.setProperty("window.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
 driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("\"https://opensource-demo.orangehrmlive.com/");
 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
 driver.findElement(By.id("btnLogin")).click();

 driver.findElement(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]/li[1]/a/b")).click();
driver.findElement(By.id("menu_admin_UserManagement")) .click();
driver.findElement(By.id("menu_admin_viewSystemUsers")) .click();
	
ExportEmployees Ae=new  ExportEmployees();		
Ae.ExportEmployees(driver);




Ae.ExportEmployees();

System.gc();

	
	
	
	
	
	
	}

	//Exportusers US= new Exportusers();
	//US.Exportusers();
	
	public  void Exportusers(int irow)throws Exception
	{
	// no of the //*[@id="resultTable"]/thead/tr/th=5
		String userscols="//*[@id='resultTable']/thead/tr/th";
		List<WebElement> columns=driver.findElements(By.xpath(userscols));
		System.out.println("No of columns in webtable :" + columns.size());
	
		//no of the rows     //*[@id="resultTable"]/tbody/tr/td[2]
		String usersrows= "//*[@id='resultTable']/tbody/tr/td[2]";
		List<WebElement> rows= driver.findElements(By.xpath(usersrows));
		System.out.printf("No of rows in webtable:", +rows .size());
		
		ExcelApiTest3 eat= new ExcelApiTest3();
		
		for(int i=1 ;i<=rows.size();i++);
		{
			for(int j=2,k=0; j<=columns.size();k++);
			{
				String strg="*[@id='resultTable']/tbody/tr[ +k+] "+ "/td" +"[+i+]";
				WebElement elem= driver.findElement(By.xpath("strg"));
				Thread.sleep(3000);
				String WebElementText= elem.getText(); 
				if (WebElementText !=null);
	           eat.putcellData("C://HTML Report//OrangeHRM6//TC01_EMPExport.xls","Sheet4",i,k,WebElementText);
				else
				eat.putCellData("C://HTML Report//OrangeHRM6//TC01_EMPExport.xls","Sheet4", i,k,"Blank Data");
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
