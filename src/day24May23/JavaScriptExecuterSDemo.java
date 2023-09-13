package day24May23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterSDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(3000l);
		//scroll down using JavasriptExector
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000);","");
		Thread.sleep(3000l);
		
		js.executeScript("window.scrollBy(0,-2000);","");
		
		//send text into text field using javasriptexecutor
		WebElement txtSearch = driver.findElement(By.name("s"));
		js.executeScript("arguments[0].value='Shubham Takras';", txtSearch);
		
		//Clicking using javascriptExecutor
		WebElement lnkAbout = driver.findElement(By.xpath("//a[@href='https://jqueryui.com/about/']"));
		js.executeScript("arguments[0].click();",lnkAbout);
		
		String actHdr = driver.findElement(By.xpath("//h1[contains(text(),'About jQuery UI')]")).getText();
		String expHdr = "About jQuery UI";
		if(actHdr.equals(expHdr))
		
			System.out.println("Test Case Passed!!");
		else
			System.out.println("Test Case is NOt passed");
		driver.navigate().back();
		
		WebElement lnkTwitter = driver.findElement(By.linkText("Twitter"));
		lnkTwitter.click();
	//	js.executeScript("arguments[0].scrollIntoView(true);", lnkTwitter);
		
		
			
	}
	
}
