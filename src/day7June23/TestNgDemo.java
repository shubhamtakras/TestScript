package day7June23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgDemo {

	@Test
	public void openUrl()
	{
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

		
	}
}
