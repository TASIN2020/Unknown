package base;
	
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
		
		WebDriver driver;
		private Scanner sc;
		
		@BeforeSuite
		public WebDriver setup() {
			sc = new Scanner(System.in); 
			System.out.println("If you want Chrome, Press 1");
			System.out.println("If you want Firefox, Press 2");
			System.out.println("Now Please enter a number: ");
			
			int a= sc.nextInt(); 
			
			if(a == 1) {
				WebDriverManager.chromedriver().setup();
						driver = new ChromeDriver();
						
			}
			
			
			else if (a==2) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			return driver;
		}
		
		@AfterSuite
		public void tearDown() {
			driver.close();
		}
}
