package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Without Page Factory
public class LoginPage {


		WebDriver driver;
		
		//Constructor
		LoginPage(WebDriver d)
		{
			driver = d;	
		}
		
		By username = By.id("user-name");
		By password = By.id("password");
		By loginbtn = By.id("login-button");
		
		public void enterUsername(String uname)
		{
			driver.findElement(username).sendKeys(uname);
		}
		public void enterPassword(String pwd)
		{
			driver.findElement(password).sendKeys(pwd);
		}
		public void clickonloginebtn()
		{
			driver.findElement(loginbtn).click();	
		}
		
		
		
		
	

}
