package Applications.Keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.Reporter;

import Applications.ObjectRepository.AppObjects;
import Framework.ObjectHandler;

public class ValidateRemove implements AppObjects {
	public static void ValidateRemove(WebDriver driver) {
		try {
			ObjectHandler objHand = new ObjectHandler(driver);
			objHand.findElement(btnRemove);
			Thread.sleep(3000);
			
			if (objHand.verifyElementExist(btnRemove)==false)
			{
			 Reporter.log("Remove was displayed");
		}
			else {
				
				System.out.println("Failed:Remove button has not displayed");
				objHand.ScreenShot(driver);
			
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
}
}