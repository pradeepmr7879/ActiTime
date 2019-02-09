import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class MouseProgram {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puma.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement men = driver.findElement(By.xpath("//a[@data-subnav='men-subnav']"));
		
		 Actions act = new Actions(driver);
		 act.moveToElement(men).perform();
		 
		 WebElement run = driver.findElement(By.linkText("Running"));
		 run.click();
		

		
		
		
		
		
	}

}
