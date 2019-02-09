package MyOwnProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox
{

	public static void main(String[] args) throws InterruptedException 
	{
		
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			WebElement path = driver.findElement(By.xpath("//select"));
			Select s1 = new Select(path);
			
			s1.selectByIndex(2);
			Thread.sleep(5000);
			s1.selectByValue("91");
			
			
	}

}
