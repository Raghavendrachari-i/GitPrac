package Applications.TestScripts;

import org.openqa.selenium.WebDriver;

//import com.sun.security.auth.login.ConfigFile;

import Framework.ObjectHandler;
import Framework.configureFileReader;
import Applications.Keyword.LaunchUrl;
import Applications.Keyword.ValidateMenu;
import Applications.Keyword.ValidateRemove;
import Applications.Keyword.addToCart;
import Applications.Keyword.login;
import Framework.BrowserInvoke;
import Framework.ExcelUtils;

@SuppressWarnings("unused")
public class TS_Swag_Remove_01 {

	public static void main(String[] args) {
		
		configureFileReader configureFile=new configureFileReader();
		
		//String url=ExcelUtils.getData("TS_Swag_Remove_01", "Url");
       	String url=configureFile.getUrlLink();
		String browserName=ExcelUtils.getData("TS_Swag_Remove_01", "Browser");
		String userName=ExcelUtils.getData("TS_Swag_Remove_01", "UserName");
		String Password=ExcelUtils.getData("TS_Swag_Remove_01", "Password");
		
                                                                         		
	    //startthedriver
		WebDriver driver = BrowserInvoke.startDriver(browserName);
		//launch Url
		LaunchUrl.LaunchUrl(driver, url);
		//login page
		login.login(driver, userName, Password);
		//Click on add to cart
		addToCart.addToCart(driver);
		//Validate remove button
		ValidateRemove.ValidateRemove(driver);
		//stop the driver
		BrowserInvoke.stopDriver(driver);
		
		

		

	
				
			
	}

}
