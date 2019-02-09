package MyOwnProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpliandExpli {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement sport = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		sport.click();
		try
		{
		wait.until(ExpectedConditions.titleContains("Online Shoping Site"));
		}
		catch(TimeoutException t)
		{
		String tit = driver.getTitle();
		System.out.println(tit);
		
		driver.close();
		}

		
		
		
		
	}

	}


