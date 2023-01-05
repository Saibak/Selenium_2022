/**
 * 
 */
package com.telus.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

/*======================================================================
| Author :  Saiba.Kaur
| Project:  Demo Registration  
| Date   :  25-Nov-2022 
 *=======================================================================*/
public class RegisterForDemoPage {

	public WebDriver driver;

	@FindBy(how= How.ID, using ="vfb-5")
	@CacheLookup
	WebElement firstName;

	@FindBy(how = How.ID, using ="vfb-7")
	@CacheLookup
	WebElement lastName;

	@FindBy(how = How.ID, using ="vfb-8-2")
	@CacheLookup
	WebElement gender;

	@FindBy(how = How.ID, using ="vfb-13-address")
	@CacheLookup
	WebElement streetAddress;

	@FindBy(how = How.ID, using = "vfb-13-address-2")
	@CacheLookup
	WebElement buildingNumber;

	@FindBy(how = How.ID, using ="vfb-13-city")
	@CacheLookup
	WebElement city;

	@FindBy(how = How.ID, using="vfb-13-zip")
	@CacheLookup
	WebElement zipcode;

	@FindBy(how = How.ID, using = "vfb-13-state")
	@CacheLookup
	WebElement province;

	@FindBy(how = How.ID, using ="vfb-14")
	@CacheLookup
	WebElement email;

	@FindBy(how = How.ID, using = "vfb-18")
	@CacheLookup
	WebElement dateOfDemo;

	@FindBy(how = How.ID, using = "vfb-19")
	@CacheLookup
	WebElement mobileNumber;

	@FindBy(how = How.ID, using ="vfb-23")
	@CacheLookup
	WebElement enterYourQuery;

	@FindBy(how = How.ID, using = "vfb-20-0")
	@CacheLookup
	WebElement checkBoxSelWeb;

	@FindBy(how = How.ID, using = "vfb-20-4")
	@CacheLookup
	WebElement checkBoxFuncTest;

	@FindBy(how = How.ID, using = "vfb-13-country")
	@CacheLookup
	WebElement country;

	@FindBy(how = How.ID, using = "vfb-16-hour")
	@CacheLookup
	WebElement timeHH;

	@FindBy(how = How.ID, using = "vfb-16-min")
	@CacheLookup
	WebElement timeMM;

	@FindBy(how = How.ID, using ="vfb-3")
	@CacheLookup
	WebElement verification;

	@FindBy(how = How.XPATH, using ="//*[contains(text(), 'Example:')]")
	@CacheLookup
	WebElement verificationCode;

	@FindBy(how = How.ID, using = "vfb-4")
	@CacheLookup
	WebElement submitButton;

	@FindBy(how = How.XPATH, using = "//*[text() = 'Register For Demo']")
	@CacheLookup
	WebElement title ;

	String titleValue;
	String code;
	String arrCodeValue[]; 
	String getCode;

	public RegisterForDemoPage(WebDriver driver) {
		this.driver=driver;
	}

	//Title
	public void retrieveTitle() {
		//Title text
		titleValue = title.getText();
		if(title.isDisplayed()) {
			Reporter.log("Title is displayed.");
			Reporter.log("Title is: "+ titleValue);
			Reporter.log("---------------------------------");
		}
		else {
			Reporter.log("Title is not displayed.");
			Reporter.log("---------------------------------");
		}
	}

	//First Name
	public void setFirstName(String firstNameValue) {
		if(firstName.isDisplayed()) {

			Reporter.log("First Name is displayed.");
			firstName.sendKeys(firstNameValue);
			Reporter.log("First Name is: "+firstNameValue);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("First Name is not displayed.");
			Reporter.log("---------------------------------");
		}


	}

	//Last Name
	public void setLastName(String lastNameValue) {
		if(lastName.isDisplayed()) {

			Reporter.log("Last Name is displayed.");
			lastName.sendKeys(lastNameValue);
			Reporter.log("Last Name is: "+lastNameValue);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Last Name is not displayed.");
			Reporter.log("---------------------------------");
		} 
	}

	//Gender
	public void selectFemaleRadioBtn() {
		if (gender.isSelected()) {

			Reporter.log("Female radio button is selected.");
		}

		else {
			Reporter.log("Female radio button is not selected. Please select it.");
			gender.click();
			Reporter.log("Female radio button SELECTED.");
			Reporter.log("---------------------------------");
		}

	}

	//Street Address
	public void setStreetAddr(String streetAddValue) {
		if (streetAddress.isDisplayed()) {

			Reporter.log("Street Address is displayed.");
			streetAddress.sendKeys(streetAddValue);
			Reporter.log("Street Address is: "+ streetAddValue);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Street Address is not displayed.");
			Reporter.log("---------------------------------");
		}
	}

	// Apt/Suite/Bldg. number
	public void setBuildingNumber(String buildingNumberValue) {

		if (buildingNumber.isDisplayed()) {

			Reporter.log("Building number is displayed.");
			buildingNumber.sendKeys(buildingNumberValue);
			Reporter.log("Building number is: "+ buildingNumberValue);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Building number is not displayed.");
			Reporter.log("---------------------------------");
		}
	}

	//City Name
	public void setCity(String cityValue) {
		if (city.isDisplayed()) {

			Reporter.log("City is displayed.");
			city.sendKeys(cityValue);
			Reporter.log("City is: "+ cityValue);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("City is not displayed.");
			Reporter.log("---------------------------------");
		}
	}

	//Province/State/Region
	public void setProvince(String provinceValue) {

		if (province.isDisplayed()) {

			Reporter.log("Province is displayed.");
			province.sendKeys(provinceValue);
			Reporter.log("Province is: "+ provinceValue);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Province is not displayed.");
			Reporter.log("---------------------------------");
		}

	}

	// Zipcode
	public void setZipCode(String zipcodeValue) {

		if (zipcode.isDisplayed()) {

			Reporter.log("Zipcode is displayed.");
			zipcode.sendKeys(zipcodeValue);
			Reporter.log("Zipcode is: "+ zipcodeValue);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Zipcode is not displayed.");
			Reporter.log("---------------------------------");
		}
	}

	// Country drop down
	public void setCountry(String countrySelected) {

		if (country.isSelected()) {

			Reporter.log("Country is selected.");
			Reporter.log("---------------------------------");

		}

		else {
			Reporter.log("Country is not selected. Please select it.");
			Select countryValue = new Select(country);
			countryValue.selectByVisibleText(countrySelected);
			Reporter.log("Selected country is: "+ countrySelected);
			Reporter.log("---------------------------------");
		}
	}

	//Email ID
	public void setEmail(String emailValue) {

		if (email.isDisplayed()) {

			Reporter.log("Email is displayed.");
			email.sendKeys(emailValue);
			Reporter.log("Email is: "+ emailValue);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Email is not displayed.");
			Reporter.log("---------------------------------");
		}
	}

	// Date of Demo 
	public void setDateOfDemo(String dateOfDemoValue) {

		if (dateOfDemo.isEnabled()) {

			Reporter.log("Date of Demo is enabled.");
			dateOfDemo.sendKeys(dateOfDemoValue);
			Reporter.log("Date of Demo is: "+ dateOfDemoValue);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Date of Demo is not enabled.");
			Reporter.log("---------------------------------");
		}
	}

	//Convenient time For Demo
	public void setDemoTime(String timeInHours, String timeInMinutes) {

		// Time in Hours
		if (timeHH.isSelected()) {
			Reporter.log("Time in hours is selected.");
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Time in hours is not selected. Please select it.");
			Select timeHHValue = new Select(timeHH);
			timeHHValue.selectByValue(timeInHours);
			Reporter.log("Time in hours is: "+ timeInHours +" Hrs");
			Reporter.log("---------------------------------");
		}

		//Demo Time in Minutes	
		if (timeMM.isSelected()) {

			Reporter.log("Time in minutes is selected.");
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Time in minutes is not selected. Please select it.");
			Select timeMMValue = new Select(timeMM);
			timeMMValue.selectByValue(timeInMinutes);
			Reporter.log("Time in minutes is: "+ timeInMinutes +" Min");
			Reporter.log("---------------------------------");

		}
	}

	// Mobile Number
	public void setMobileNumber(String mobileNumberValue) {

		if (mobileNumber.isDisplayed()) {

			Reporter.log("Mobile Number is displayed.");
			mobileNumber.sendKeys(mobileNumberValue);
			Reporter.log("Mobile Number is: "+ mobileNumberValue);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Mobile Number is not displayed.");
			Reporter.log("---------------------------------");
		}

	}

	//Course Interested
	public void setCheckboxForCourse() {

		//Selenium Webdriver checkbox
		if (checkBoxSelWeb.isSelected()) {

			Reporter.log("Checkbox Selenium Webdriver is Selected.");
			Reporter.log("---------------------------------");

		}

		else {
			Reporter.log("Checkbox Selenium Webdriver is not Selected. Please select it.");
			checkBoxSelWeb.click();
			Reporter.log("Checkbox Selenium Webdriver is SELECTED.");
			Reporter.log("---------------------------------");
		}

		// Functional Testing Checkbox
		if (checkBoxFuncTest.isSelected()) {

			Reporter.log("Checkbox Functional Testing is Selected.");
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Checkbox Functional Testing is not Selected. Please select it.");
			checkBoxFuncTest.click();

			Reporter.log("Checkbox Functional Testing is SELECTED.");
			Reporter.log("---------------------------------");
		}

	}

	//Enter your query Textbox
	public void enterQuery(String enterYourQueryValue) {

		if (enterYourQuery.isDisplayed()) {

			Reporter.log("Query box is displayed.");
			enterYourQuery.sendKeys(enterYourQueryValue);
			Reporter.log("Query Entered: "+ enterYourQueryValue);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Query Box is not displayed.");
			Reporter.log("---------------------------------");
		}
	}

	// Check and enter verification code
	public void getVerificationCode() {

		if (verification.isDisplayed()) {

			Reporter.log("Verification textbox is displayed.");

			getCode = verificationCode.getText();
			Reporter.log("Verification code value provided is: "+ getCode);
			arrCodeValue=getCode.split(":");
			code =arrCodeValue[1].trim();
			verification.sendKeys(code);
			Reporter.log("Verification Code Entered: "+code);
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Verification textbox is not displayed.");
			Reporter.log("---------------------------------");
		}

	}

	// Click Submit Button
	public void clickSubmitBtn() {

		if(submitButton.isEnabled()) {

			Reporter.log("Submit Button is enabled.");
			submitButton.click();
			Reporter.log("---------------------------------");
		}

		else {
			Reporter.log("Submit Button is not enabled.");
			Reporter.log("---------------------------------");
		}
	}
}
