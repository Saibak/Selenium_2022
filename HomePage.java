/**
 * 
 */
package com.telus.pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

/*======================================================================
| Author :  Saiba.Kaur
| Project:  Navigation to demo page  
| Date   :  25-Nov-2022 
 *=======================================================================*/
public class HomePage {

	public WebDriver driver;


	//Mouse Hover to QA Automation
	@FindBy(how = How.LINK_TEXT, using ="QA AUTOMATION")
	@CacheLookup
	WebElement qaAutomation;

	//Mouse Hover to Practice Automation
	@FindBy(how = How.LINK_TEXT, using ="Practice Automation")
	@CacheLookup
	WebElement practiceAutomation;

	//launching the demo url
	@FindBy(how = How.PARTIAL_LINK_TEXT, using ="Registration")
	@CacheLookup
	WebElement registerationForm;

	public HomePage(WebDriver driver) {
		this.driver= driver;
	}


	public void demoUrl() {

		Actions action = new Actions(driver);
		action.moveToElement(qaAutomation).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		action.moveToElement(practiceAutomation).perform();

		registerationForm.click(); 
		Reporter.log("Demo Page Launched");
	}

}
