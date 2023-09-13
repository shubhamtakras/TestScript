package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
//	1. India    Qutub minar
//  2. Agra     Taj Mahal
//  3.Hyderabad charminar
	
	@DataProvider(name = "searchDataSet")
	public Object[][] searchData()
	{
		Object[][] searchkeyWord = new Object[3][2];
		searchkeyWord[0][0] = "India";
		searchkeyWord[0][1] = "Qutub minar";
		
		searchkeyWord[1][0] = "Agra";
		searchkeyWord[1][1] = "Taj Mahal";
		
		searchkeyWord[2][0] = "Hyderabad";
		searchkeyWord[2][1] = "charminar";
		
		return searchkeyWord;
	}

	@Test(dataProvider = "searchDataSet")
	public void googlesearch(String country ,String monument)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(country+" "+monument );
		
		driver.findElement(By.name("btnI")).submit();
	}
}
