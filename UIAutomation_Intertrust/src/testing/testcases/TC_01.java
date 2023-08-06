package testing.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import testing.Base.Base;
import testing.pages.LoginPage;
import testing.pages.LogoutPage;

public class TC_01 extends Base
{
        @Test	
		public void m1() throws InterruptedException, IOException
		{
        	LoginPage ref1=new LoginPage(driver,pr);
        	ref1.tc1_signin("dineshfulpagare11@gmail.com","Test@2023");
        	LogoutPage ref2=new LogoutPage(driver,pr);
        	ref2.tc4_signout();
		}
	}
