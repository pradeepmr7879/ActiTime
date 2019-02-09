package Com.ActiTime2.Library;

import org.testng.annotations.Test;


public class ActiTime_Login_SIT_Invalid extends BaseTest
{
 @Test
 public void ActiTime_Login_SIT_Invalid()
 {
	 LoginPage l1 = new LoginPage(driver);
		l1.setUN("admin");
		l1.setPW("wdjkn");
		l1.clickLogin(  );
		
 }
}
