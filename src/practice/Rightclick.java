package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement element1 = driver.findElement(By.id("rightClickBtn"));
		
		Actions act = new Actions(driver);
		act.contextClick(element1).perform();
		Thread.sleep(3000l);
		
		WebElement element2 = driver.findElement(By.id("doubleClickBtn"));
		
		act.doubleClick(element2).perform();
		
		driver.quit();
		
	
	}
}
