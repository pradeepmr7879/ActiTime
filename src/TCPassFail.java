import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TCPassFail 
{
	@BeforeMethod
	public void openApp()
	
	{
		Reporter.log("opens app", true);
	}
	@Test
	public void TC1()
	{
		Reporter.log("Test Case1", true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("TestCase 1", true);
	}
	
	@AfterMethod
	public void closeApp(ITestResult iRes)
	{
		Reporter.log(iRes.getName()+"->"+iRes.getStatus(), true);
		Reporter.log("Closes App", true);
	 
	}

}
