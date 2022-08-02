package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Mobileautomation {
WebDriver driver;

@BeforeMethod
public void launchingbrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yasmeen.kouser\\Downloads\\chromedriver_win32.zip");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.manage().window().maximize();
	
}

@AfterMethod
public void closingbrowser()
{
	driver.quit();
}
}
