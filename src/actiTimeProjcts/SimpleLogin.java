package actiTimeProjcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
		un.sendKeys("admin");
		Thread.sleep(5000);
		WebElement pw = driver.findElement(By.xpath("//input[@name='pwd']"));
		pw.sendKeys("manager");
		Thread.sleep(5000);
		System.out.println("hi");
		
		WebElement btn = driver.findElement(By.xpath("//div[text()= 'Login ']"));
		btn.click();
		driver.close();
		
		
		

	}

}
