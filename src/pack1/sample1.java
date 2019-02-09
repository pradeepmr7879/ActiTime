package pack1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample1
{

	@BeforeSuite
	public void welcome()
	{
	Reporter.log("welccome", true);
	
	}
	
	@BeforeTest
	public void connectDB()
		{
		Reporter.log("connectDB", true);
		
		}
	
	@BeforeClass
	public void openApp()
		{
		Reporter.log("Openapp", true);
		
		}
	
	
	@BeforeTest
	
	public void login()
		{
		Reporter.log("login", true);
		
		}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout", true);
		             
	}

		
	@AfterClass
	public void closeApp()
		{
		Reporter.log("closeapp", true);
		
		}
		
	@AfterTest
	public void endDB()
	{
		Reporter.log("endapp", true);
	}

	@AfterSuite
	public void end()
	{
	Reporter.log("end", true);
	
	}
	
	
}
