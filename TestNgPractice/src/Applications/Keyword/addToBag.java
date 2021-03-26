package Applications.Keyword;

import org.openqa.selenium.WebDriver;

import Applications.ObjectRepository.AppObjects;
import Framework.ObjectHandler;

public class addToBag implements AppObjects{
	public static void btnContinueShop(WebDriver driver) throws Throwable {
		ObjectHandler objHand =new ObjectHandler(driver);
		objHand.clickthebuuton(btnContinueShop);
		Thread.sleep(3000);
	}

	public static void addToBag(WebDriver driver, int currentItemsCount) {
		try {
			ObjectHandler objHand =new ObjectHandler(driver);
			//By btnAddtoCart = null;
			objHand.clickthebuuton(btnAddtoBag);
			Thread.sleep(3000);
			int actualItems=objHand.getElements(btnAddtoBag).size();
			
			if(actualItems==currentItemsCount)
			{
			 objHand.clickthebuuton(btnContinueShop);
		
			System.out.println(objHand.getElements(btnAddtoBag).size());
			
			}
			
			else
			{
			    driver.get("https://www.saucedemo.com/inventory.html");
				//System.out.println("Continue shopping failed");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}

	
}
