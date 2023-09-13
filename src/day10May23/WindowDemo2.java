package day10May23;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement btnopenwindow = driver.findElement(By.xpath("//fieldset/button"));
		btnopenwindow.click();
		
		Set<String> windIds = driver.getWindowHandles();
		Iterator<String> iter = windIds.iterator();
		String pWindId = iter.next();
		System.out.println("parent window Id : "+pWindId);
		String cWindId = iter.next();
		System.out.println("child window Id : "+cWindId);
		
		driver.switchTo().window(cWindId);
		String childActUrl = driver.getCurrentUrl();
		String childExpUrl = "https://www.letskodeit.com/practice";
		Thread.sleep(4000l);
		driver.switchTo().window(pWindId);
		String parentActUrl = driver.getCurrentUrl();
		String parentExpUrl = "https://www.letskodeit.com/practice";
		Thread.sleep(4000l);
		
		if(childActUrl.equals(childExpUrl))
			System.out.println("Test Case#1 Passed!!");
		else
			System.out.println("Test Case#1 Failed!!");
		
		if(parentActUrl.equals(parentExpUrl))
			System.out.println("Test Case#2 Passed!!");
		else
			System.out.println("Test Case#2 Failed!!");
}
}
 