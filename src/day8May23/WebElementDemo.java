package day8May23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {
	
	static void verifyActualAndExpectedURL(String hyperLinkName, String actUrl, String expUrl) {
		if(actUrl.equals(expUrl))
			System.out.println(hyperLinkName+"=> Test case passed !");
		else
			System.out.println(hyperLinkName+"=> Test case not passed !");
		
	}

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement linkblog = driver.findElement(By.linkText("BLOG"));
		linkblog.click();
		String actUrl = driver.getCurrentUrl();
		System.out.println("Actual Blog actUrl ==>  "+actUrl);
		String expUrl = "https://www.letskodeit.com/blog";
		verifyActualAndExpectedURL("BLOG",actUrl,expUrl);
		
		driver.findElement(By.linkText("SUPPORT")).click();
		String actSupportUrl = driver.getCurrentUrl();
		String expSupportUrl = "https://www.letskodeit.com/support";
		System.out.println("Support Actual URL ==>  "+actSupportUrl);
		verifyActualAndExpectedURL("SUPPORT",actSupportUrl,expSupportUrl);
		
		driver.findElement(By.partialLinkText("PRACT")).click();
		String actPracticeUrl = driver.getCurrentUrl();
		String expaPracticeUrl = "https://www.letskodeit.com/support";
		System.out.println("Partially Actual URL ==>  "+actSupportUrl);
		verifyActualAndExpectedURL("SUPPORT",actSupportUrl,expSupportUrl);
		
		Thread.sleep(4000l);
		driver.quit();
		
		
		
		
		
		
		

	}

}
