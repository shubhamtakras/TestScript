package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNgParallelTestingDemo {

	WebDriver driver;
	
	@Test
	public void verifyTitle() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		
		Thread.sleep(2000);
		
		driver.quit();
		
}
	@Test
	public void verifyLogo() throws InterruptedException
	{
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
//		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		
		Assert.assertTrue(logo.isDisplayed());
		
		Thread.sleep(2000);
		
		driver.quit();
		
}
}
