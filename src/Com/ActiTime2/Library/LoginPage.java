package Com.ActiTime2.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	//declaration
	@FindBy(id= "username")
	private WebElement untb;
	
	@FindBy(name= "pwd")
	private WebElement pwtb;
	
	@FindBy(xpath= "//div[.='Login ']")
	private WebElement loginBtn;
	
	//initialization
	 public LoginPage(WebDriver driver)
	 {
		PageFactory.initElements(driver, this); 
	 }
	
	//utilization
	 public void setUN(String un)
	 {
		 untb.sendKeys(un);
	 }
	 public void setPW(String pw)
	 {
		 pwtb.sendKeys(pw);
		 
	 }
	 public void clickLogin()
	 {
		 loginBtn.click();
			 
	 }
}
