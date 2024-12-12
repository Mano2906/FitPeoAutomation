package Test;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.RevenueCalculator;



public class RevenueCalculator_TC 
{
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fitpeo.com/");
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  	TakesScreenshot HomePageScreenshot = (TakesScreenshot)driver;  //Typecasted
	    File HPSFile = HomePageScreenshot.getScreenshotAs(OutputType.FILE);
	    File HPSLocation = new File("D:\\STS\\FitPeo\\Screenshots\\HomePage.png");
	    HPSFile.renameTo(HPSLocation);
	}
	
	@Test
	void revenueCalculatorTest() throws InterruptedException
	{
		RevenueCalculator rev = new RevenueCalculator(driver);
		rev.clickOnRevenueCalculator();
		rev.scrolldown();
		rev.setSliderValue();
		rev.entertheTextField(560);
		rev.SelectCPTCode();
		rev.validateTotalRecurringReimbursement();
	}
}
