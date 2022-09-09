package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class CommonMethods {
	
	WebDriver driver;
	
	public CommonMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnButton(By btn) {
		
		driver.findElement(btn).click();
	}
	
	public void sendText(By element, String value) {
		driver.findElement(element).sendKeys(value);
	}
	
	public void hoverOnButton(By btn) {
		WebElement hover = driver.findElement(btn);
		Actions action = new Actions(driver);
		action.clickAndHold(hover).build().perform();
	}
	
	
	
	

}

