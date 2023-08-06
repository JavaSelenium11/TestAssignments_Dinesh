package testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public WebDriver driver;
    public Properties pr;
	
	@BeforeMethod
	public void launch() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.visualcrossing.com/");
		
		File f=new File("../UIAutomation_Intertrust/src/objects.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		
		Thread.sleep(3000);
		WebElement acceptcookies=driver.findElement(By.xpath(pr.getProperty("xpath1")));
		acceptcookies.click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
    public void browserclose() throws InterruptedException
    {
		Thread.sleep(5000);
		driver.close();
    }

}
