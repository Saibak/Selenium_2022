/**
 * 
 */
package com.telus.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

/*======================================================================
| Author :  Saiba.Kaur
| Project:  Final confirmation message  
| Date   :  25-Nov-2022 
 *=======================================================================*/
public class RegistrationMsgPage {

	public WebDriver driver;


	// Locator for confirmation message
	@FindBy(how = How.XPATH, using ="//*[contains(text(), 'Registration Form is Successfully Submitted.')]")
	@CacheLookup
	WebElement confirmationMsg;

	public RegistrationMsgPage(WebDriver driver) {

		this.driver = driver;	
	}

	public void registerationMsg() {

		String confirmationMsgValue = confirmationMsg.getText(); 
		//Confirmation msg with transaction id
		if(confirmationMsg.isDisplayed()) {
			Reporter.log("Confirmation message is displayed.");
			Reporter.log("Form filled successfully. Confirmation message is :" + confirmationMsgValue);
			Reporter.log("---------------------------------");
		}
		else {
			Reporter.log("Confirmation message is not displayed.");
			Reporter.log("---------------------------------");
		}
	}


}
