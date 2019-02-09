package FindAnnot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage

{
	@FindBy (id = "username")
	private WebElement UNTB;
	
	@FindBy (name = "pwd")
	private WebElement PWTB;
	
	
	@FindBy (xpath= "//div[.='Login ']")
	private WebElement CLG;
	
	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

	public void setUN(String user)
	{
		UNTB.sendKeys(user);
	}
	
	public void  setPW(String pass)
	{
		PWTB.sendKeys(pass);
	}
	
	
	public void  clickLogin()
	{
		CLG.click();
	}
}
