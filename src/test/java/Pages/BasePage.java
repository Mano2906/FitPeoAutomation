package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BasePage
	{
	//Constructor
	WebDriver driver;
	
		public BasePage(WebDriver driver)
		{
			this.driver = driver;
		}
		
		//Locators
		By revenueCalculatorLink = By.xpath("//div[text()='Revenue Calculator']");
		By scrolltoSlider = By.xpath("//h4[text()='Medicare Eligible Patients']");
		By ScrolltoCPTCode = By.xpath("//p[text()='Total Recurring Reimbursement for all Patients Per Month']");
		By showsthevalue = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 inter css-12bch19'][normalize-space()='$0'][1]");
		By slider = By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']");
		By textField  = By.xpath("//input[@type='number']");
		
	}
