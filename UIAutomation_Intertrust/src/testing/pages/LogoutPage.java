package testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
	WebDriver driver;
	Properties pr;
	public LogoutPage(WebDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void tc4_signout() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement logoutbutton1=driver.findElement(By.xpath(pr.getProperty("xpath10")));
		logoutbutton1.click();
		Thread.sleep(2000);
		WebElement logoutbutton2=driver.findElement(By.xpath(pr.getProperty("xpath11")));
		logoutbutton2.click();
	}
}
