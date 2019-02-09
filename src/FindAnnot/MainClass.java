package FindAnnot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		LoginPage l= new LoginPage(driver);
		l.setUN("admin");
		l.setPW("manager");
		l.clickLogin();
		
	}

}
