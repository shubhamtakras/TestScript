package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkey {

	public static void main(String[] args) {
		// TODO Auto-generated metho
		String url = "https://www.google.com/";
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("");//it gives Illegal Argument Exception
		

	}

}
