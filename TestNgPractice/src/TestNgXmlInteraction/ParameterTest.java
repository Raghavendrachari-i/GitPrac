package TestNgXmlInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	
	//private static final String Priority = null;
	public static WebDriver driver;
	
	@Test(priority=1)
	public void BrowserInvoke() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\B.Raghavendrachari\\Desktop\\browser\\Chrome 89.0.4\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    System.out.println("entered browser");
	    Assert.assertEquals("TestNg", "TestNg");
	    Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void getUrl() throws InterruptedException {
		driver.get("http://www.google.com/");
		System.out.println("entered google");
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	@Parameters("s")
	public void parameter(String s) throws Exception
	{
		WebElement SearchSpace = driver.findElement(By.xpath("//input[@name='q']"));
		SearchSpace.sendKeys(s);
		System.out.println("entered java");
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void ClickSearch() throws InterruptedException {
		WebElement ClickSearch = driver.findElement(By.xpath("//input[@class='gNO89b']"));
        ClickSearch.click();
        System.out.println("entered search");
        Thread.sleep(2000);
	}
	
	@Test(priority=5)
	public void ViewItems( ) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		System.out.println("used scroll down");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");
		System.out.println("used scroll up");
		Thread.sleep(2000);
	}
	
	@Test(priority=6)
	public void QuitBrowser() {
		
		driver.close();
		System.out.println("closed current tab");
		driver.quit();
		System.out.println("exited browser");
	}
	
	

}
