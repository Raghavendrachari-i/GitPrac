package Applications.Keyword;

import org.openqa.selenium.WebDriver;

import Framework.ObjectHandler;

public class LaunchUrl {
    public static void LaunchUrl(WebDriver driver, String Url)
    {
    	
    	try {
    		ObjectHandler objHand= new ObjectHandler(driver);
    		objHand.launchURL(Url);
    		Thread.sleep(3000);
    		
    	}
    	catch(Exception e)
    	{
    		
    	}
    	
    }
}
