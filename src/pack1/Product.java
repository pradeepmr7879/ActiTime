
package pack1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Product extends sample1 
{
@Test(priority= 1)
	public void createproduct()
	{
	Reporter.log("productcreated", true);
	}
	@Test(priority= 2)
	public void modifyproduct()
	{
	Reporter.log("modified", true);
	}
	
	@Test(priority= 3)
	public void deleteproduct()
	{
	Reporter.log("productdeleted", true);
}

}


