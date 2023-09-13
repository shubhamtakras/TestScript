package facegenie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException{
		String url = "https://facegenie-ams-school.web.app/";
		WebDriver driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.clear();
		txtEmail.sendKeys("testbams@gmail.com");
		
		WebElement txtPwd = driver.findElement(By.id("password"));
		txtPwd.clear();
		txtPwd.sendKeys("facegenie");
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
		
		Thread.sleep(15000l);
		
		driver.quit();
		
		
	}
}
