package Applications.Keyword;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;
import Applications.ObjectRepository.AppObjects;
import Framework.ObjectHandler;

public class Logout implements AppObjects{
	

		public static void Logout(WebDriver driver) {
			
			
			try 
			{
				ObjectHandler objHand =new ObjectHandler(driver);
				objHand.clickthebuuton(btnClickMenu);
				Thread.sleep(3000);
				
				ObjectHandler objHand1 =new ObjectHandler(driver);
				objHand1.clickthebuuton(btnLogout);
				Thread.sleep(5000);
				
				if(driver.getCurrentUrl().equalsIgnoreCase("https://www.saucedemo.com/"))
				{
					System.out.println("Logout successful");
				}
				else
				{
					System.out.println("Logout unsuccessful");
				}
			}
			catch(Exception e)
			{
			e.printStackTrace();	
			}
			
				
		}

	}


