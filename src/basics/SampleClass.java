package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class SampleClass {
	public static void testBrowser(WebDriver driver)
	{
		driver.get("file:///C:/Users/PRADEEP%20M%20R/Desktop/alltype.html");
		WebElement link = driver.findElement(By.className("c1"));
		link.click();
	}

	public static void main(String[] args) {

		String ChromeKey = "webdriver.chrome.driver";
		String ChromeValue = "./softwares/chromedriver.exe";
		System.setProperty(ChromeKey, ChromeValue);
		ChromeDriver driver = new ChromeDriver();

		testBrowser(driver);
	}

}
