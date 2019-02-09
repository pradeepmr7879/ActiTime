package MyOwnProjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotics {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puma.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		 WebElement xp = driver.findElement(By.xpath("//a[.='SHOP WOMEN']"));
		
		act.contextClick(xp).perform();
		Thread.sleep(2000);
		Robot r1 = new Robot();
		//r1.keyPress(KeyEvent.VK_);
		r1.keyPress(KeyEvent.VK_T);
	
		
		
		
		

	}
}
