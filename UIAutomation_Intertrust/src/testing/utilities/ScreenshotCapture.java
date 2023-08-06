package testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenshotCapture 
{
	public static void screenshot(WebDriver driver,String path) throws IOException
	{
		File source=((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(path));
	}
}
