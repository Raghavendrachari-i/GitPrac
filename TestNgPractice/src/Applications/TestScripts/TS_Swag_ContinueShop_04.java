package Applications.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Applications.Keyword.LaunchUrl;
import Applications.Keyword.Logout;
import Applications.Keyword.ValidateMenu;
import Applications.Keyword.addToBag;
import Applications.Keyword.addToCart;
import Applications.Keyword.addToCartContinue;
import Applications.Keyword.login;
import Framework.BrowserInvoke;
import Framework.ExcelUtils;

public class TS_Swag_ContinueShop_04 {
	
	public static void main(String[] args) throws Exception {
		
		String url=ExcelUtils.getData("TS_Swag_ContinueShop_04", "Url");
				String browserName=ExcelUtils.getData("TS_Swag_ContinueShop_04", "Browser");
				String userName=ExcelUtils.getData("TS_Swag_ContinueShop_04", "UserName");
				String Password=ExcelUtils.getData("TS_Swag_ContinueShop_04", "Password");
				
		                                                                         		
			    //startthedriver
				WebDriver driver = BrowserInvoke.startDriver(browserName);
				//launch Url
				LaunchUrl.LaunchUrl(driver, url);
				//login page
				login.login(driver, userName, Password);
				
				for(int i=1;i<=3;i++)
				{
				//Click on add to cart
				WebElement select=driver.findElement(By.xpath("//div[@class='inventory_item']["+i+"]//child::button"));
				select.click();
				//Click cart folder and Continue button
				//addToCartContinue.addToCartContinue(driver);
				int currentItemsCount=i;
				addToBag.addToBag(driver, currentItemsCount );
				try
				{
					try {
						addToBag.btnContinueShop(driver);
						Thread.sleep(5000);
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 } 
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
				//Click Menu
				ValidateMenu.ValidateItemMenu1(driver);
				System.out.println("Shopping completed for three items");
				Thread.sleep(3000);
				
				//Click Logout
				Logout.Logout(driver);
				//stop the driver
				BrowserInvoke.stopDriver(driver);							
					
			}
}
