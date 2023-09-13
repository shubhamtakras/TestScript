package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNg {
	@Test//(description="This is Test Case 1")
	public void testcase1() 
	{
		String url = "https://www.facebook.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		//driver.close();
		
		System.out.println("Test Case 1");
	}
	@Test(enabled=true)
	public void testcase2()
	{
		System.out.println("Test Case 2");
	}

}
