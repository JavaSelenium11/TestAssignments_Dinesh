package testing.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage 
{
	WebDriver driver;
	Properties pr;
	public Homepage(WebDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void tc2_forecast() throws InterruptedException
	{
		WebElement entertext1=driver.findElement(By.xpath(pr.getProperty("xpath2")));
		entertext1.sendKeys("Mumbai");
		WebElement dropdown=driver.findElement(By.xpath(pr.getProperty("xpath3")));
		dropdown.click();
		Thread.sleep(2000);
		List<WebElement> alloptions=driver.findElements(By.xpath(pr.getProperty("xpath4")));
	    for(WebElement i:alloptions)
	    {
		if(i.getText().contains("Forecast"))
		{
			i.click();
			break;
		}
	    }
	    Thread.sleep(2000);
	    WebElement searchbutton1=driver.findElement(By.xpath(pr.getProperty("xpath5")));
	    searchbutton1.click();
	    Thread.sleep(2000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,200)");
	}
	    
	    public void tc3_history() throws InterruptedException
	    {
	    	WebElement entertext2=driver.findElement(By.xpath(pr.getProperty("xpath2")));
			entertext2.sendKeys("Pune");
			Thread.sleep(2000);
			WebElement searchbutton2=driver.findElement(By.xpath(pr.getProperty("xpath5")));
		    searchbutton2.click();
		    Thread.sleep(2000);
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,200)");
	    }
	}

