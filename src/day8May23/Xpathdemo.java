package day8May23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) throws InterruptedException  {
    String Url = "https://www.letskodeit.com/practice";
    WebDriver driver = new ChromeDriver();
    driver.get(Url);
    driver.manage().window().maximize();
    
   // WebElement rBtnBmw = driver.findElement(By.xpath("//input[@id='bmwradio']"));
  //  rBtnBmw.click();
    
    driver.findElement(By.xpath("//input[@value='benz' and @type='radio']")).click();
    Thread.sleep(3000l);
    driver.quit();
    
    
    
	}

}
