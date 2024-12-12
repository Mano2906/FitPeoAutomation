package Pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class RevenueCalculator extends BasePage{
	
	public RevenueCalculator(WebDriver driver)
	{
		super(driver);
	}
	
	//Clicking the Revenue Calculator link
	public void clickOnRevenueCalculator() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(revenueCalculatorLink).click();
	}
	//Scroll Down to the Slider 
	public void scrolldown() throws InterruptedException
	{
		//Screen Shot for the Revenue Calculator Page
		TakesScreenshot RevenueCalculatorPage = (TakesScreenshot)driver;  //Typecasted
	    File RCPFile = RevenueCalculatorPage.getScreenshotAs(OutputType.FILE);
	    File RCPLocation = new File("D:\\STS\\FitPeo\\Screenshots\\RevenueCalculatorPage.png");
	    RCPFile.renameTo(RCPLocation);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrolldowntoslider = driver.findElement(scrolltoSlider);
		// Scrolling down the page till the slider is found		
        js.executeScript("arguments[0].scrollIntoView();", scrolldowntoslider);
        Thread.sleep(2000);
      //Screen Shot for the Default Slider
        TakesScreenshot DefaultsliderScreenchot = (TakesScreenshot)driver;  //Typecasted
	    File DSSFile = DefaultsliderScreenchot.getScreenshotAs(OutputType.FILE);
	    File DSSLocation = new File("D:\\STS\\FitPeo\\Screenshots\\DefaultsliderScreenchot.png");
	    DSSFile.renameTo(DSSLocation);
	}
	
	//Moving the Slider to 820
	public void setSliderValue() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Slider = driver.findElement(slider);
		Actions moveSlider = new Actions(driver);
		moveSlider.dragAndDropBy(Slider, 94, 0).perform();
		WebElement SliderInputTextBox = driver.findElement(textField);
		System.out.println("Get the Slider Value: "+SliderInputTextBox.getAttribute("value"));
        boolean SliderValueDisplayed = SliderInputTextBox.isDisplayed();
        System.out.println("Slider Value is: "+ SliderValueDisplayed);
    	Assert.assertNotEquals(SliderInputTextBox, "823", "Slider Value is incorrect.");
    	 //Screen Shot for the Moved Slider
        TakesScreenshot MovedSliderScreenShot = (TakesScreenshot)driver;  //Typecasted
	    File MSSFile = MovedSliderScreenShot.getScreenshotAs(OutputType.FILE);
	    File MSSLocation = new File("D:\\STS\\FitPeo\\Screenshots\\MoveedSliderScreenShot.png");
	    MSSFile.renameTo(MSSLocation);
	}

	//Entering the Text Field as 560 
	public void entertheTextField(int value) throws InterruptedException {
		Thread.sleep(2000);
		WebElement textFieldValue = driver.findElement(textField);
		//To clear the previous Text in Text Field
		textFieldValue.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		textFieldValue.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		textFieldValue.sendKeys(String.valueOf(value));	
        //Screen Shot for the TextField Value
        TakesScreenshot TextFieldValueScreenshot = (TakesScreenshot)driver;  //Typecasted
	    File TFVSFile = TextFieldValueScreenshot.getScreenshotAs(OutputType.FILE);
	    File TFVSLocation = new File("D:\\STS\\FitPeo\\Screenshots\\TextFieldValueScreenshot.png");
	    TFVSFile.renameTo(TFVSLocation);
        // Validation for Text Field Element 
        System.out.println("Get the Text Field Value: "+textFieldValue.getAttribute("value"));
        boolean displayed = textFieldValue.isDisplayed();
        System.out.println("TextField Value is: "+ displayed);
	}
	
	//Select CPT Codes By Clicking the CheckBoxes
	public void SelectCPTCode() throws InterruptedException 
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ScrolldowntoCPTcodes = driver.findElement(ScrolltoCPTCode);
		// Scrolling down the page till the CPT Codes of 1st 3 CheckBoxes is found		
        js.executeScript("arguments[0].scrollIntoView();", ScrolldowntoCPTcodes);
        //Screen Shot for the CTP Code Default Screenshot
        TakesScreenshot CTPCodeDefaultScreenshot = (TakesScreenshot)driver;  //Typecasted
	    File CPTCDSFile = CTPCodeDefaultScreenshot.getScreenshotAs(OutputType.FILE);
	    File CPTCDSLocation = new File("D:\\STS\\FitPeo\\Screenshots\\CTPCodeDefaultScreenshot.png");
	    CPTCDSFile.renameTo(CPTCDSLocation);
        //Clicking the CheckBoxes of 1st 3 
        WebElement CPT99091_Checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        CPT99091_Checkbox.click();
        Thread.sleep(1000);
        WebElement CPT99453_Checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        CPT99453_Checkbox.click();
        Thread.sleep(1000);
        WebElement CPT99454_Checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        CPT99454_Checkbox.click();
        Thread.sleep(2000);
        //Screen Shot for the CTP Code 1st Three CheckBox Screenshot
        TakesScreenshot CPTCode1stThreeCheckboxScreenshot = (TakesScreenshot)driver;  //Typecasted
	    File CPTC1TCSFile = CPTCode1stThreeCheckboxScreenshot.getScreenshotAs(OutputType.FILE);
	    File CPTC1TCSLocation = new File("D:\\STS\\FitPeo\\Screenshots\\CPTCode1stThreeScreenshot.png");
	    CPTC1TCSFile.renameTo(CPTC1TCSLocation);
	    Thread.sleep(2000);
        WebElement ScrolldowntoCpt99474 = driver.findElement(By.xpath("//p[normalize-space()='CPT-99458']"));
		// Scrolling down the page till the Cpt99474 Checkbox is found		
        js.executeScript("arguments[0].scrollIntoView();", ScrolldowntoCpt99474);
        js.executeScript("window.scrollBy(0,75)");
        Thread.sleep(2000);
        WebElement CPT99474_Checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
        CPT99474_Checkbox.click();
        Thread.sleep(2000);
      //Screen Shot for the CTP Code 4th CheckBox Screenshot
        TakesScreenshot CPTCode4thCheckboxScreenshot = (TakesScreenshot)driver;  //Typecasted
	    File CPTC4CSFile = CPTCode4thCheckboxScreenshot.getScreenshotAs(OutputType.FILE);
	    File CPTC4CSLocation = new File("D:\\STS\\FitPeo\\Screenshots\\CPTCode4thCheckboxScreenshot.png");
	    CPTC4CSFile.renameTo(CPTC4CSLocation);
	}
	
	//Validating and verifying the Total Recurring Reimbursement
	public void validateTotalRecurringReimbursement() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ScrollUptoOTR = driver.findElement(By.xpath("//p[normalize-space()='One Time Reimbursement for all Patients Annually']"));
		// Scrolling down the page till the Cpt99474 Checkbox is found		
        js.executeScript("arguments[0].scrollIntoView();", ScrollUptoOTR);
		
	    //Validating and verifying the Total Recurring Reimbursement
//		WebElement totalReimbursement = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 inter css-1msk7rm'][contains(text(),'Total Recurring Reimbursement for all Patients Per')]"));
		WebElement totalReimbursement = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 inter css-12bch19'][normalize-space()='$75600']"));
//		WebElement totalReimbursement = driver.findElement(By.xpath("(//p[@class=\"MuiTypography-root MuiTypography-body1 inter css-12bch19\"])[1]")); 
		
		System.out.println("Get the Total Recurring Reimbursment: "+totalReimbursement.getText());
        boolean TotalRecurringReimbursmentValue = totalReimbursement.isDisplayed();
        System.out.println("Total Recurring Reimbursment Value is: "+ TotalRecurringReimbursmentValue);
        Assert.assertNotEquals(totalReimbursement, "$75600", "Total Recurring Reimbursement value is incorrect.");
        
        //Screen Shot for the Total Recurring Reimbursment Screenshot
        TakesScreenshot TotalRecurringReimbursmentScreenshot = (TakesScreenshot)driver;  //Typecasted
        File TRRSFile = TotalRecurringReimbursmentScreenshot.getScreenshotAs(OutputType.FILE);
  	    File TRRSLocation = new File("D:\\STS\\FitPeo\\Screenshots\\TotalRecurringReimbursment.png");
  	    TRRSFile.renameTo(TRRSLocation);
	}
}