package Com.ActiTime2.Library;

import org.testng.annotations.Test;

public class Actitime_Login_SIT_01 extends BaseTest
{
	@Test
	public void actitime_login_sit_01()
	{
		LoginPage l1 = new LoginPage(driver);
		l1.setUN("admin");
		l1.setPW("manager");
		l1.clickLogin(  );
		
				
	}
}
