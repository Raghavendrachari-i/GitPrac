package TestNgXmlInteraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Utility {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void BrowserInvoke() throws Throwable  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\B.Raghavendrachari\\Desktop\\browser\\Chrome 89.0.4\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}
	
	@AfterMethod
	public void QuitBrowser() {
		
		driver.close();
		driver.quit();
	}
	

}
