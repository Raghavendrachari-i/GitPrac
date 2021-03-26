package Applications.Keyword;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Applications.ObjectRepository.AppObjects;
import Framework.ObjectHandler;

public class ValidateMenuItems implements AppObjects{
	public static void ValidateMenuItems(WebDriver driver)
	{
	try {
		ObjectHandler objHand=new ObjectHandler(driver);
		
		List<WebElement> elements=ObjectHandler.getElements(btnItemList);
		System.out.println(elements.size());
		for (WebElement element:elements)
		{
			System.out.println(element.getText());
		}
		
		if(elements.size()==4)
		{
			for(int i=1;i<=4;i++)
			{
				String runtimeXpath=btnItemsLists;
				runtimeXpath=runtimeXpath.replace("x", Integer.toString(i));
				
				System.out.println(runtimeXpath);
				
				WebElement element=driver.findElement(By.xpath(runtimeXpath));
			
			    String str = element.getText();
			    
			    System.out.println(str);
				
				if(str.equals("All Items")||str.equals("About")||str.equals("Logout")||str.equals("Reset App State"))
				{	
					System.out.println("Pass");
				}
				else
				{
					System.out.println("elements not matching");
				}
			}
			
		}
		
	else
	{
		System.out.println("Fail");
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}