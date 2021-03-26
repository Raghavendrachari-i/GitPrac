package Applications.TestScripts;

import org.openqa.selenium.WebDriver;
import Applications.Keyword.LaunchUrl;
import Applications.Keyword.VerifyErrormsg;
import Applications.Keyword.login;
import Framework.BrowserInvoke;
import Framework.ExcelUtils;



public class TS_Swag_Validate_ErrorMsg_03 {

	public static void main(String[] args) {
				
				
				
	    // String url=ExcelUtils.getData("4", "F");				
		String url=ExcelUtils.getData("TS_Swag_Validate_ErrorMsg_03", "Url");
		String browserName=ExcelUtils.getData("TS_Swag_Validate_ErrorMsg_03", "Browser");
		String userName=ExcelUtils.getData("TS_Swag_Validate_ErrorMsg_03", "UserName");
		String Password=ExcelUtils.getData("TS_Swag_Validate_ErrorMsg_03", "Password");
						
				                                                                         		
		  //startthedriver
		WebDriver driver = BrowserInvoke.startDriver(browserName);
		  //launch Url
		LaunchUrl.LaunchUrl(driver, url);
		  //login page
		login.login(driver, userName, Password);
		  //Verify Error Message
		VerifyErrormsg.VerifyErrormsg(driver);
		  //stop the driver
		BrowserInvoke.stopDriver(driver);
						
															
					}

	}


