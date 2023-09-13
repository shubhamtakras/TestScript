package day6May23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTextDemo {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		String actUrl = "https://www.letskodeit.com/practice";
		driver.get(actUrl);
		driver.manage().window().maximize();
		
		String expUrl = "https://www.letskodeit.com/practice";
		if(expUrl.equals(actUrl))
			System.out.println("we landed up at right URL : test case passed!");
		else
			System.out.println("we landed up at wrong URL : test case failed!");
		
		WebElement txtElement = driver.findElement(By.id("autosuggest"));
		txtElement.sendKeys("Shubham Takras","Ranbir Kapur","Shahid Kapur");
		Thread.sleep(5000l);
		
		txtElement.clear();
		txtElement.sendKeys("Anushka","Hruta","Keerthy Suresh");
		Thread.sleep(5000l);
		driver.findElement(By.id("autosuggest")).sendKeys("Cyber Success Pune");
		Thread.sleep(5000l);
		
		driver.quit();
	}

}
