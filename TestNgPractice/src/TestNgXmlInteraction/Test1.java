package TestNgXmlInteraction;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 extends Utility{
	//public static WebDriver driver;
	
	@Test(groups="StartPage",enabled=true,priority=1)
	public void test1()
	{
		//driver.get("http://www.google.com/");
		driver.get("http://www.google.com/");
		System.out.println("executed test1");
	}
	
	@Test(groups="TestPage",priority=2)
	public void test2()
	{
		driver.get("https://www.saucedemo.com/");
		System.out.println("executed test2");
	}
	
	@Test(groups="Checkin",priority=3)
	public void test3()
	{
		driver.get("https://www.facebook.com/");
		Reporter.log("executed test3");
	}
	
	@Test(groups="Checkin",dependsOnMethods="test3")
	public void test4()
	{
		driver.get("https://www.olacabs.com/");
		System.out.println("executed test4");
	}
	
	@Test(groups="Checkin",priority=4)
	public void test5()
	{
		driver.get("https://www.javatpoint.com/");
		Reporter.log("executed test5");
	}

	
}
