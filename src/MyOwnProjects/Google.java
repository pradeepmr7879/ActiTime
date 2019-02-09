package MyOwnProjects;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google
{

	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://converge.slk-soft.com//");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count = allLinks.size();
		System.out.println(count);
		
		for(WebElement linkName : allLinks)
		{
			 String name = linkName.getText();
			 String url = linkName.getAttribute("href");
			 System.out.println(name+"-->"+url);
		}
		
	
		
	}
}
