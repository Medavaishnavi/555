package AAA;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import commonutil.launcher;

public class Login {
 

WebDriver driver;


@Test
  public void  login() throws Exception
  
  {
    driver = launcher.login();
    		
    		
  }
}
