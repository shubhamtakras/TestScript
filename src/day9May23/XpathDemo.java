package day9May23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement ele = driver.findElement(By.xpath("//*[@data-uniqid='1621702280245']"));
		String actLblValue = ele.getText();
		String expLblValue  = "practice Page";
		if(actLblValue.equals(expLblValue))
			System.out.println("test case passed !!!!");
		else
			System.out.println("Test case Failed, expValue: "+expLblValue+" : "+"actValue : "+actLblValue);
		driver.quit();
		
		
	}

}
