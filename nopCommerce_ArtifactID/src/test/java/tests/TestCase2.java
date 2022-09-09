package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.Base;
import model.CommonMethods;
import model.Locators;
import model.Timeout;
import pages.HomePage;

public class TestCase2 {

	Base base = new Base();
	WebDriver driver = base.setup();
	CommonMethods commonMethods = new CommonMethods(driver);
	HomePage homePage  = new HomePage(driver);
	Timeout time = new Timeout();
	
	@BeforeClass
	public void start() {
		driver.get(homePage.homePageUrl());
		driver.manage().window().maximize();		
	}
	
	@Test
	public void loginTest() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("TestReport2.html");
		extent.attachReporter(spark);

		driver.switchTo().frame(0);
		
		commonMethods.hoverOnButton(Locators.ElectronicsHover);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.CellPhones);
		time.timeout();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		commonMethods.clickOnButton(Locators.NokiaLumia);
		time.timeout();
		
		driver.findElement(Locators.SelectQuantity).clear();
		time.timeout();
		
		commonMethods.sendText(Locators.SelectQuantity, "2");;
		time.timeout();
		
		commonMethods.clickOnButton(Locators.AddToCart);
		time.timeout();
		time.timeout1();
		
		js.executeScript("window.scrollBy(0,-1500)", "");
		commonMethods.hoverOnButton(Locators.HoverShoppingCart);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.GoToCart);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.TermsAndConditions);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.Checkout);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.CheckoutAsGuest);
		time.timeout();
		
		commonMethods.sendText(Locators.FirstName, "Karim");
		time.timeout();
		
		commonMethods.sendText(Locators.LastName, "Aliur");
		time.timeout();
		
		commonMethods.sendText(Locators.Email, "karim@Ali.COM");
		time.timeout();
		
		commonMethods.clickOnButton(Locators.CountrySelect);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.CountryBangladeshSelect);
		time.timeout();
		
		commonMethods.sendText(Locators.City, "Dhakaa");
		time.timeout();
		
		commonMethods.sendText(Locators.Address, "Konaparaa");
		time.timeout();
		
		commonMethods.sendText(Locators.ZipCode, "1234");
		time.timeout();
		
		commonMethods.sendText(Locators.Phone, "01919191929");
		time.timeout();
		
		commonMethods.clickOnButton(Locators.Continue);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.NextDayAirShipping);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.next);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.CreditCardPayment);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.creditCardContinue);
		time.timeout();
		
		commonMethods.sendText(Locators.CardHolderName, "Tasin Tazwar");
		time.timeout();
		
		commonMethods.sendText(Locators.CardNo, "4321550000254266");
		time.timeout();
		
		commonMethods.clickOnButton(Locators.CardMonth);
		time.timeout();
		
		commonMethods.sendText(Locators.CardCode, "234");
		time.timeout();
		
		commonMethods.clickOnButton(Locators.PaymentInfoSave);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.Confirm);
		time.timeout();

		
		driver.switchTo().parentFrame();
		
        base.tearDown();
		
		ExtentTest test2 = extent.createTest("Test Case 2: 2 pieces of Nokia Lumia are purchesed");
		test2.log(Status.PASS, "Purchase successful ");
		extent.flush();
		
	}
}
