package actiTimeProjcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement un = driver.findElement(By.xpath("//input[@id= \"username\"]"));
		un.sendKeys("admin");
		WebElement pw = driver.findElement(By.xpath("//input[@name= \"pwd\"]"));
		pw.sendKeys("manager");
		driver.findElement(By.xpath("//div[text()= 'Login ']")).click();
		Thread.sleep(4000);
		System.out.println("hi");
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		System.out.println("hello");
		
		   
		
		
		
	}

}
