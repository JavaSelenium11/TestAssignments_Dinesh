package testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver driver;
	Properties pr;
	public LoginPage(WebDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void tc1_signin(String user,String pwd) throws InterruptedException
	{
		WebElement loginbutton=driver.findElement(By.xpath(pr.getProperty("xpath6")));
		loginbutton.click();
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath(pr.getProperty("xpath7")));
		username.sendKeys("dineshfulpagare11@gmail.com");
		WebElement password=driver.findElement(By.xpath(pr.getProperty("xpath8")));
		password.sendKeys("Test@2023");
		Thread.sleep(3000);
		WebElement signinbutton=driver.findElement(By.xpath(pr.getProperty("xpath9")));
		signinbutton.click();
	}
}
