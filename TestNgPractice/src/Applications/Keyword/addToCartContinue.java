package Applications.Keyword;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Applications.ObjectRepository.AppObjects;
import Framework.ObjectHandler;
import Applications.TestScripts.*;
public class addToCartContinue implements AppObjects{
	public static void addToCartContinue(WebDriver driver){
	ObjectHandler objHand=new ObjectHandler(driver);
	String btnAddToCartContinue = null;
	
	try
	{
	if(driver.getCurrentUrl().equals("https://www.saucedemo.com/cart.html"))
	{
		
		int currentItemsCount = 0;
		int i=currentItemsCount;
		for(int i1=1;i1<=3;i1++)
		{
		    
			WebElement select=driver.findElement(By.xpath("//div[@class='inventory_item']["+i1+"]//child::button"));
			select.click();
			
		}
	}
		else
		{
			objHand.clickthebuuton(btnClickMenu);
		}		
	}
	
	catch(Exception e)
	{
	e.printStackTrace();	
	}

}
}