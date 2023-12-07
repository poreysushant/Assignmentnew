package QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public static WebDriver driver;
	public static WebDriver initBrowser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
		 driver=new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		return driver;
	}
	public  static WebDriver getDriver()
	{
		return driver;
	}

}
