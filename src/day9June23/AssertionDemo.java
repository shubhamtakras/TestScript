package day9June23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	public void testMethod()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println("verifying Title.....");
		String expectedTitle = "Automation Testing Practice";
		String actualTitle   = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle,"Title Verification failed");
		
		System.out.println("Verifying presence of wikipedia-icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		Assert.assertTrue(icon.isDisplayed());
		
		System.out.println("Verifying presence of wikipedia-search-button");
		WebElement searchbtn = driver.findElement(By.className("wikipedia-search-button"));
		Assert.assertTrue(searchbtn.isDisplayed());
		
		
		
		
		
}
}
