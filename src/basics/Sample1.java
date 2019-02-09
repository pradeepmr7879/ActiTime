package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 
	{
		public static void main(String[] args)
		{
			
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.close();
		}
}