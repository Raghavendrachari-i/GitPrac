package Framework;

import java.io.File;
import java.io.IOException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class ObjectHandler {

	public static WebDriver driver;
	
	//Constructor Creation
	public ObjectHandler(WebDriver wbdriver)
	{
		driver= wbdriver;
	}
	
	public void launchURL(String URL)
	{
		try 
		{
			driver.get(URL);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static WebElement getElement (By propValue)
	{
		WebElement element = null;
		try {
			element = driver.findElement(propValue);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}
	
	public void enterText(By propValue, String value)
	{
		try {
			WebElement element = ObjectHandler.getElement(propValue);
			
			element.sendKeys(value);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void findElement(By propValue)
	{
		try {
			WebElement element = ObjectHandler.getElement(propValue);
			
			element.isDisplayed();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void findElement2(By propValue)
	{
		try {
			WebElement select = ObjectHandler.getElement(propValue);
			
			select.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	public boolean verifyElementExist(By propValue) 
	{
		boolean elementExistence = false;
		try {
			WebElement element = ObjectHandler.getElement(propValue);
		
			if(element.isDisplayed())
			{
				elementExistence = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return elementExistence;
	}

	public static List<WebElement> getElements(By propValue) 
	{
		List<WebElement> elements=null;
		try {
			elements=driver.findElements(propValue);
		}
		catch (Exception e)
		{
			
		}
		return elements;
		
	}
	
//	public static int currentItemsCount;{
//		//currentItemsCount=null
//		currentItemsCount=driver.findElements(arg0);
//	}
	
	public static String getText (By propValue)
	
	{
		WebElement elements=null;
		try {
		WebElement txtSearch=driver.findElement(propValue);
		txtSearch.getText();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public void clickthebuuton(By propValue) 
	{
		try{
			WebElement clickthebuuton=driver.findElement(propValue);
			clickthebuuton.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
 public static void ScreenShot(WebDriver driver) throws IOException
 {
	 configureFileReader configureFile=new configureFileReader();
	 
	 String timeStamp=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	 TakesScreenshot takeshot=(TakesScreenshot) driver;
	 File src=takeshot.getScreenshotAs(OutputType.FILE);
	 //Object configFile;
	//File des=new File(configureFile.getScreenShotPath()+timeStamp+".png");
	// File destiny=new File("C:\\Work\\workspace\\HybridFramework.zip_expanded\\ScreenShot\\"+timeStamp+".png");
	File destiny=new File(configureFile.getScreenShotPath()+timeStamp+".png");
	 System.out.println(destiny);
	 Files.copy(src, destiny);
 }
 }


 