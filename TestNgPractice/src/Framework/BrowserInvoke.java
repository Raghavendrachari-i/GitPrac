package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserInvoke {

	public static WebDriver startedDriver;
	
	public static WebDriver startDriver(String browserName)
	{
		//configureFileReader configureFile=new configureFileReader();
		
		try 
		{
			configureFileReader configureFile=new configureFileReader();
			if(browserName.equalsIgnoreCase("chrome"))
			{
				//Assignment 1: Change the browser exe path to the common location for all user. Hint: Insider Project folder path
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\B.Raghavendrachari\\Desktop\\browser\\Chrome 89.0.4\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", configureFile.getChromePath());
				startedDriver =new ChromeDriver();
				//Implict Waits
				//startedDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				startedDriver.manage().window().maximize();
				Thread.sleep(3000);
				//startedDriver.manage().window().fullscreen();
			}
			else if (browserName.equalsIgnoreCase("ie")) 
			{
				System.setProperty("webdriver.edge.driver", "C:\\Users\\B.Raghavendrachari\\Desktop\\browser\\msedgedriver.exe");
				startedDriver=new EdgeDriver();
				//startedDriver.manage().window().fullscreen();
				startedDriver.manage().window().maximize();
				Thread.sleep(3000);
			}
			else
			{
				System.out.println("Invalid choice");
			}
			//Assignment 2: Handle all browser with if-else if - else condition
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return startedDriver;
	}
	
	public static void stopDriver(WebDriver driver)
	{
		try 
		{
			driver.close();
			driver.quit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
