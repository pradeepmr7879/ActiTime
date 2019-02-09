
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		Date d1 = new Date();
		String s1 = d1.toString();
		
		String s2 = s1.replaceAll(":", "-");
		System.out.println(s2);
		
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement clk = driver.findElement(By.xpath("//a[@id='loginButton']"));
		clk.click();
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File srcFile = t1.getScreenshotAs(OutputType.FILE);
		File  destFile = new File("E://ScreenShots/screen1"+s2+".png");		
		FileUtils.copyFile(srcFile, destFile);
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

	

}
