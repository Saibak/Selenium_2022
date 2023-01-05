package com.telus.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.telus.pages.HomePage;
import com.telus.pages.RegisterForDemoPage;
import com.telus.pages.RegistrationMsgPage;

public class RegisterForDemoPageFactory {

	public WebDriver driver;
	String url ="https://nxtgenaiacademy.com/";

	@BeforeTest
	public void launchBrowser() {

		//Set driver Path
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		//Launch the Website
		driver.get(url);

		//Maximizing the screen size.
		driver.manage().window().maximize();

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

	@Test(priority=1)
	public void navigateToDemo() {
		HomePage demo =PageFactory.initElements(driver, HomePage.class);
		demo.demoUrl();
	}

	@Test(priority=2)
	public void registerForDemo() {
		RegisterForDemoPage register = PageFactory.initElements(driver, RegisterForDemoPage.class);
		register.retrieveTitle();
		register.setFirstName("Saiba");
		register.setLastName("Kaur");
		register.selectFemaleRadioBtn();
		register.setStreetAddr("Victoria Park Ave");
		register.setBuildingNumber("1290");
		register.setProvince("Ontario");
		register.setCity("Toronto");
		register.setZipCode("M4A 2M5");
		register.setCountry("Canada");
		register.setEmail("saibakaur07@gmail.com");
		register.setDateOfDemo("19/11/2022");
		register.setDemoTime("13", "30");
		register.setMobileNumber("4167123900");
		register.setCheckboxForCourse();
		register.enterQuery("Do we have any weekend classess?");
		register.getVerificationCode();
		register.clickSubmitBtn();
	}

	@Test(priority=3)
	public void confirmationMsg() {
		RegistrationMsgPage confirmation = PageFactory.initElements(driver, RegistrationMsgPage.class);
		confirmation.registerationMsg();

	}
}
