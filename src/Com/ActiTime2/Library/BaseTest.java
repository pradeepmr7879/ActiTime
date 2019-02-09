package Com.ActiTime2.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest
{
  public  WebDriver driver;
  static
  {
	  System.setProperty("webdriver.chrome.driver" , "./softwares/chromedriver.exe" );
	  
	
	}
	  	   
  
  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

  @BeforeClass
  public void OpenApp()
  {
	 /*
	  * open browser
	  * enter url
	  * verify if actitime login page is displayed or not 
	  */
	  driver = new ChromeDriver();
	  driver.get("http://localhost/login.do");
	  System.out.println("oye");
	  
  }
   @AfterClass
   public void PostCondition()
   {
	   /*
	    * check if test case is pass or fail
	    * if fail, take screen shots
	    */
	   System.out.println("hello");
	   
   }
  
  @AfterClass
  public void closeApp()
  {
	  /*
	   * close browser
	   	   */
	 // driver.close();
	  System.out.println("hi");
	  
  }



}
