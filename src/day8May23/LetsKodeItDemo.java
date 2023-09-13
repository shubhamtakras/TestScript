package day8May23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LetsKodeItDemo {
public static void main(String[] args) throws InterruptedException {
	String url = "https://www.letskodeit.com/practice";
	WebDriver driver = new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	//operate on radio buttons
	driver.findElement(By.id("hondaradio")).click();
	Thread.sleep(3000l);
	driver.findElement(By.id("bmwradio")).click();
	Thread.sleep(3000l);
	driver.findElement(By.id("benzradio")).click();
	Thread.sleep(3000l);
	
	
	//operate on check box
	driver.findElement(By.id("hondacheck")).click();
	Thread.sleep(3000l);
	driver.findElement(By.id("benzcheck")).click();
	Thread.sleep(3000l);
	driver.findElement(By.id("bmwcheck")).click();
	Thread.sleep(3000l);
	driver.quit();
	
}
}
