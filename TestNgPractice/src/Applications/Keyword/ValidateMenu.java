package Applications.Keyword;

import org.openqa.selenium.WebDriver;

import Applications.ObjectRepository.AppObjects;
import Framework.ObjectHandler;


	public class ValidateMenu implements AppObjects { 
		public static void ValidateItemMenu1(WebDriver driver) {
			try {
				ObjectHandler objHand =new ObjectHandler(driver);
				objHand.clickthebuuton(btnClickMenu);
				Thread.sleep(3000);
								
				}
			    catch(Exception e)
				{			    
			    	e.printStackTrace();
				}
			}
		

	}


