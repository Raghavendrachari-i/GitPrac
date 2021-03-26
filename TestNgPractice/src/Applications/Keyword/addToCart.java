package Applications.Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Applications.ObjectRepository.AppObjects;
import Framework.ObjectHandler;

public class addToCart implements AppObjects {
	public static void addToCart(WebDriver driver) {
		try {
			ObjectHandler objHand =new ObjectHandler(driver);
			//By btnAddtoCart = null;
			objHand.clickthebuuton(btnAddtoCart);;
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}