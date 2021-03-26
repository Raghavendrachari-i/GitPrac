package Applications.Keyword;

import Applications.ObjectRepository.AppObjects;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Applications.ObjectRepository.AppObjects;
import Framework.ObjectHandler;

public class validateLogout implements AppObjects {
	public static void validateLogout1(WebDriver driver)
	{
	try {
		ObjectHandler objHand=new ObjectHandler(driver);
		WebElement elements=objHand.getElement(btnLogout);
		
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

//	public static void validateLogout(WebDriver driver) {
//		// TODO Auto-generated method stub
//		
	}
