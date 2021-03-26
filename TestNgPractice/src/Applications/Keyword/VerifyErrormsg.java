package Applications.Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Applications.ObjectRepository.AppObjects;
import Framework.ObjectHandler;

public class VerifyErrormsg implements AppObjects { 
	public static void VerifyErrormsg(WebDriver driver) {
		try {
			ObjectHandler objHand =new ObjectHandler(driver);
			objHand.clickthebuuton(btnLogin);
			WebElement objHand1=driver.findElement(ViewErrormsg);
			String str=objHand1.getText();
			//String str=objHand.getText(Errormsg);
			Thread.sleep(3000);
		
			if (str.equals("Epic sadface: Sorry, this user has been locked out."))   
					{
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test Failed");
			}
			}
		    catch(Exception e)
			{			    
		    	e.printStackTrace();
			}
		}
	


}
