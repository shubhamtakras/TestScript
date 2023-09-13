package day10May23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement elebmw = driver.findElement(By.id("bmwradio"));
		elebmw.click();
		Thread.sleep(3000l);
		
		WebElement elebenz  = driver.findElement(By.id("benzradio"));
		elebenz.click();
		Thread.sleep(3000l);
		
		WebElement elehonda = driver.findElement(By.id("hondaradio"));
		elehonda.click();
		Thread.sleep(3000l);
		
		driver.quit();
	}

}
