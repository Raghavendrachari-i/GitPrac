package Applications.Keyword;

import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import Applications.ObjectRepository.AppObjects;
import Framework.ObjectHandler;

public class login implements AppObjects {


	public static void login(WebDriver driver,String username,String password) 
	{
		try
		{
			ObjectHandler objectHand=new ObjectHandler(driver);
			objectHand.enterText(txtLoginUserName, username);
			Thread.sleep(3000);
			objectHand.enterText(txtLoginPassword, password);
			Thread.sleep(3000);
			objectHand.clickthebuuton(btnLogin);
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 

	}

}
