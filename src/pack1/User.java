package pack1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class User extends sample1 
{
@Test(priority= 1)
	public void createUser()
	{
	Reporter.log("usercreated", true);
	}
	@Test(priority= 2)
	public void modifyUser()
	{
	Reporter.log("modified", true);
	}
	
	@Test(priority= 3)
	public void deleteuser()
	{
	Reporter.log("userdeleted", true);
}

}

