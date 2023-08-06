package testing.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import testing.Base.Base;
import testing.pages.Homepage;
import testing.utilities.ScreenshotCapture;

public class TC_03 extends Base
{
    @Test	
	public void m3() throws InterruptedException, IOException
	{
    	Homepage ref=new Homepage(driver,pr);
    	ref.tc3_history();
    	ScreenshotCapture.screenshot(driver,"D://ScreenShots//TC_03.png");
	}
}
