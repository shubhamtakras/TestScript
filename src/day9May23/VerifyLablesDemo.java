package day9May23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLablesDemo {

	public static void main(String[] args) {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		String expLbValue = "Radio Button example";
		WebElement actLbValue = driver.findElement(By.xpath("//input[@value=]"));
		
		if(expLbValue.equals(actLbValue))
			System.out.println("Test Case is passed!!!");
		else
			System.out.println("Test Case is Failed!!! ");
		driver.quit();
	}

}
