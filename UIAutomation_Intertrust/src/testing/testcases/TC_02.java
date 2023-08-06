package testing.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import testing.Base.Base;
import testing.pages.Homepage;
import testing.utilities.ScreenshotCapture;

public class TC_02 extends Base
{
    @Test
	public void m2() throws InterruptedException, IOException
	{
    	Homepage ref1=new Homepage(driver,pr);
    	ref1.tc2_forecast();
    	ScreenshotCapture.screenshot(driver,"D://ScreenShots//TC_02.png");
	}
}

