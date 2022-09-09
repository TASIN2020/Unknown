package tests;

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

public class TestCase1 {

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
		ExtentSparkReporter spark = new ExtentSparkReporter("TestReport1.html");
		extent.attachReporter(spark);
		
		driver.switchTo().frame(0);
		
		commonMethods.clickOnButton(Locators.RegisterClick);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.CheckGender);
		time.timeout();
		
		commonMethods.sendText(Locators.FirstName, "Md. Tasin");
		time.timeout();
		
		commonMethods.sendText(Locators.LastName, "Tazwaar");
		time.timeout();
		
		commonMethods.clickOnButton(Locators.SelectBirthDay);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.BirthDayDate);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.SelectBirthMonth);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.BirthDayMonth);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.SelectBirthYear);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.BirthDayYear);
		time.timeout();
		
		commonMethods.sendText(Locators.Email, "tasin71@gmail.com");
		time.timeout();
		
		commonMethods.sendText(Locators.CompanyName, "XYZ Company");
		time.timeout();
		
		commonMethods.sendText(Locators.Password, "123456");
		time.timeout();
		
		commonMethods.sendText(Locators.ConfirmPassword, "123456");
		time.timeout();
		
		commonMethods.clickOnButton(Locators.RegisterButton);
		time.timeout1();
		
		driver.switchTo().parentFrame();
		
		base.tearDown();
		
		ExtentTest test1 = extent.createTest("Test Case 1: User Registration");
		test1.log(Status.PASS, "User Registration is successful ");
		extent.flush();
		
	}
}