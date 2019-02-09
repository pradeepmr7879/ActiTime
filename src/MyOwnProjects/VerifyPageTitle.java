package MyOwnProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	String Atitle = "facebook – log in or sign up";
	String Etitle = driver.getTitle();
	if(Atitle.equals(Etitle))
	{
		System.out.println("correct");
		
	}
	else
	{
		System.out.println("Not corre3ct");
	}
	driver.close();
	}

	}

