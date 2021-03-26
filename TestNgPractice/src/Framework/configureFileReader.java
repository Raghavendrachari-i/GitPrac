package Framework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.*;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.ScreenshotException;

import Framework.ObjectHandler;

public class configureFileReader {
	public Properties properties;
	private final String propertyFilepath="C:\\Work\\workspace\\HybridFramework.zip_expanded\\config.properties";
	
	public configureFileReader()
	{
		BufferedReader reader;
		try
		{
			reader=new BufferedReader(new FileReader(propertyFilepath));
			properties=new Properties();
			properties.load(reader);
			reader.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public String getUrlLink() {
		String geturl=properties.getProperty("urladdress");
		return geturl;
	}

	public String getChromePath() {
		String chromePath=properties.getProperty("ChromePath");
		return chromePath;
	}

	public String getScreenShotPath() {
		String ScreenShotPathval=properties.getProperty("ScreenShotPath");
		System.out.println(ScreenShotPathval);
		return ScreenShotPathval;
	}

	

}
