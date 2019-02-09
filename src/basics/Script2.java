

package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/PRADEEP%20M%20R/Desktop/abcg.html");
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.xpath("./html/body/div/input[1]"));
		un.sendKeys("abc");
	    WebElement pw = driver.findElement(By.xpath("./html/body/div/input[2]"));
	    pw.sendKeys("jdhds");
	    
	}

}
