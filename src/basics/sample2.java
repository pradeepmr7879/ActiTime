package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
	{
		public static void main(String[] args)
		{
			
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
				
		driver.get("https://www.google.co.in");
				
		
		
//driver.quit();
		
		}
}