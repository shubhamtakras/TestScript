package day11May23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling2 {

	public static void main(String[] args) {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement> low = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
		
		List<WebElement> loc = driver.findElements(By.xpath("th"));
		for(WebElement ele : loc)
			System.out.print(String.format("%-35s",ele.getText()));
		System.out.println();
	}

}
