package day29May23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200);","");
		
		driver.findElement(By.id("userName")).sendKeys("Mr Cyber Success");
		
		driver.findElement(By.id("userEmail")).sendKeys("CyberSuccess@gamil.com");
		
	WebElement currentAddress =	driver.findElement(By.id("currentAddress"));
	currentAddress.sendKeys("deccan, asmani plaza, pune-411016");
		
	    //press control+a
		String k = Keys.chord(Keys.CONTROL,"a");
		currentAddress.sendKeys(k);
		
	    //Copy into clipboard the Current Address by pressing CONTROL+A
	    k = Keys.chord(Keys.CONTROL,"c");
	    currentAddress.sendKeys(k);
	    
	    //Press the TAB Key to Switch Focus to Permanent Address
	    Actions actions = new Actions(driver);
	    actions.sendKeys(Keys.TAB).build().perform();
	    Thread.sleep(2000l);
	    
        //Paste the Address in the Permanent Address field
	    WebElement permanentAddress =driver.findElement(By.id("permanentAddress"));
	    permanentAddress.clear();
	    permanentAddress.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	    
	    Thread.sleep(5000l);
	    driver.quit();
	    
	    
		
		
	}
}
