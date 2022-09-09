package model;
	
	import org.openqa.selenium.By;
	
	public class Locators {
		
		public static String homePageUrl = "https://frontend.nopcommerce.com/"; 
		
		//testCase 01
		public static By RegisterClick = By.xpath("//a[@class='ico-register']");
		public static By CheckGender = By.xpath("//input[@id='gender-male']");
		public static By FirstName = By.xpath("//input[@data-val-required='First name is required.']");
		public static By LastName = By.xpath("//input[@data-val-required='Last name is required.']");
		public static By BirthDayDate = By.xpath("//option[@value='30']");
		public static By SelectBirthDay = By.xpath("//select[@name='DateOfBirthDay']");
		public static By SelectBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
		public static By BirthDayMonth = By.xpath("//option[contains(text(),'December')]");
		public static By SelectBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
		public static By BirthDayYear = By.xpath("//option[@value='1996']");
		public static By Email = By.xpath("//input[@data-val-required='Email is required.']");
		public static By CompanyName = By.xpath("//input[@id='Company']");
		public static By Password = By.xpath("//input[@id='Password']");
		public static By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
		public static By RegisterButton = By.xpath("//button[@id='register-button']");
		
		//testCase2
		public static By ElectronicsHover = By.xpath("//a[contains(text(),'Electronics ')]");
		public static By CellPhones = By.xpath("//a[contains(text(),'Cell phones ')]");
		public static By NokiaLumia = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
		public static By SelectQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
		public static By AddToCart = By.xpath("//button[@id='add-to-cart-button-20']");
		public static By HoverShoppingCart = By.xpath("//a[@class='ico-cart']");
		public static By GoToCart = By.xpath("//button[contains(text(),'Go to cart')]");
		public static By TermsAndConditions = By.xpath("//input[@id='termsofservice']");
		public static By Checkout = By.xpath("//button[@id='checkout']");
		public static By CheckoutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
		public static By CountrySelect = By.xpath("//select[@data-val-required='Country is required.']");
		public static By CountryBangladeshSelect = By.xpath("//option[contains(text(),'Bangladesh')]");
		public static By City = By.xpath("//input[@data-val-required='City is required']");
		public static By Address = By.xpath("//input[@data-val-required='Street address is required']");
		public static By ZipCode = By.xpath("//input[@data-val-required='Zip / postal code is required']");
		public static By Phone = By.xpath("//input[@data-val-required='Phone is required']");
		public static By Continue = By.xpath("//button[@class='button-1 new-address-next-step-button']");
		public static By NextDayAirShipping = By.xpath("//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']");
		public static By next = By.xpath("//button[@onclick='ShippingMethod.save()']");
		public static By creditCardContinue = By.xpath("//button[@onclick='PaymentMethod.save()']");
		public static By PaymentInfoSave = By.xpath("//button[@onclick='PaymentInfo.save()']");
		public static By CreditCardPayment = By.xpath("//input[@id='paymentmethod_1']");
		public static By CardHolderName = By.xpath("//input[@id='CardholderName']");
		public static By CardNo = By.xpath("//input[@id='CardNumber']");
		public static By SelectCardMonth = By.xpath("//select[@id='ExpireYear']");
		public static By CardMonth = By.xpath("//option[@value='2023']");
		public static By CardCode = By.xpath("//input[@id='CardCode']");
		public static By Confirm = By.xpath("//button[contains(text(),'Confirm')]");
	}
