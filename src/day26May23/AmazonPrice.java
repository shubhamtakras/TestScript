package day26May23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		//click on best seller
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']")).click();
		//get header lable
		
		String hdrLable = driver.findElement(By.id("zg_banner_text")).getText();
		System.out.println(hdrLable);
		
		
	}

}
