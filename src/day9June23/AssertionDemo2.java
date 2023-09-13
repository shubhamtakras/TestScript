package day9June23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo2 {

	@Test
	public void testMethod()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		SoftAssert softassert = new SoftAssert();
		
		
		System.out.println("verifying Title.....");
		String expectedTitle = "Automation Testing Practice1";
		String actualTitle   = driver.getTitle();
		softassert.assertEquals(expectedTitle, actualTitle,"Title Verification failed");
		
		System.out.println("Verifying presence of wikipedia-icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		softassert.assertTrue(icon.isDisplayed());
		
		System.out.println("Verifying presence of wikipedia-search-button");
		WebElement searchbtn = driver.findElement(By.className("wikipedia-search-button"));
		softassert.assertTrue(searchbtn.isDisplayed());
		
		softassert.assertAll();
		
		
		
		
		
		
		
		
}
}
