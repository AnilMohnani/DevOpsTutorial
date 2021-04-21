package testCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassA {

	WebDriver driver;
	@BeforeMethod
	public void login() throws MalformedURLException
	{
		DesiredCapabilities dr=DesiredCapabilities.chrome();
		//dr.setPlatform(Platform.WIN10);
		dr.setBrowserName("chrome");
       System.setProperty("webdriver.chrome.driver", "C:/Users/AnilY/Downloads/chromedriver_win32/chromedriver.exe");
       driver=new RemoteWebDriver(new URL("http://192.168.99.1:4444/wd/hub"), dr);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void test1()
	{
	 driver.get("https://automationtalks.com/");
	 System.out.println(driver.getTitle());
		
	}
	@Test
	public void test2()
	{
	 driver.get("https://cricbuzz.com/");
	 System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void test3()
	{
	 driver.get("https://shaadi.com/");
	 System.out.println(driver.getTitle());
		
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
