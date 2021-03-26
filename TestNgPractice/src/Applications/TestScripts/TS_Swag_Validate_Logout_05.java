package Applications.TestScripts;

import org.openqa.selenium.WebDriver;

import Applications.Keyword.LaunchUrl;
import Applications.Keyword.Logout;
import Applications.Keyword.ValidateMenu;
import Applications.Keyword.ValidateMenuItems;
import Applications.Keyword.login;
import Applications.Keyword.validateLogout;
import Framework.BrowserInvoke;
import Framework.ExcelUtils;

public class TS_Swag_Validate_Logout_05 {
  public static void main(String[] args) {
		
		String url=ExcelUtils.getData("TS_Swag_Validate_Logout_05", "Url");
				String browserName=ExcelUtils.getData("TS_Swag_Validate_Logout_05", "Browser");
				String userName=ExcelUtils.getData("TS_Swag_Validate_Logout_05", "UserName");
				String Password=ExcelUtils.getData("TS_Swag_Validate_Logout_05", "Password");
				
		                                                                         		
			    //startthedriver
				WebDriver driver = BrowserInvoke.startDriver(browserName);
				//launch Url
				LaunchUrl.LaunchUrl(driver, url);
				//login page
				login.login(driver, userName, Password);
				//Validate Item Menu
				ValidateMenu.ValidateItemMenu1(driver);
				//Click Logout
				Logout.Logout(driver);
				//Validate Logout
				//validateLogout.validateLogout1(driver);
				//stop the driver
				BrowserInvoke.stopDriver(driver);							
					
			}
	
}


