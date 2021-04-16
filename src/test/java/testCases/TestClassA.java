package testCases;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassA {

	WebDriver driver;
	@BeforeMethod
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
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
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
