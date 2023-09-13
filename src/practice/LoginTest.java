package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
	//	LoginPage loginPg = new LoginPage(driver);
		
		LoginPage2 loginPg = new LoginPage2(driver);
		
	
		driver.get("https://www.saucedemo.com/v1/");
		
		loginPg.enterUsername("standard_user");
		loginPg.enterPassword("secret_sauce");
		loginPg.clickonloginebtn();
		
		
		
	}

}
