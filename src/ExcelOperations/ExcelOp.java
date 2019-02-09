package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelOp 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException 
	{
		String path = "./Data/LoginPage.xlsx";
		
		//To create the connection between code and excel
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		
		//Reading the data from Existing sheet, existing row and existing cell
		String data1 = wb.getSheet("LoginPage").getRow(1).getCell(0).getStringCellValue();
		String data2 = wb.getSheet("LoginPage").getRow(1).getCell(1).getStringCellValue();
		

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		
		WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
		un.sendKeys(data1);
		WebElement pw = driver.findElement(By.xpath("//input[@name='pwd']"));
		pw.sendKeys(data2);
		Thread.sleep(3000);
	
		
		WebElement btn = driver.findElement(By.xpath("//div[text()= 'Login ']"));
		btn.click();
		
		
	}
}
