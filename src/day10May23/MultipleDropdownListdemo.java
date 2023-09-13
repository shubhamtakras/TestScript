package day10May23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.systeminfo.SystemInfo;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultipleDropdownListdemo {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement multipleDropdownList = driver.findElement(By.id("multiple-select-example"));
		Select select = new Select(multipleDropdownList);
		System.out.println("isMultiple: "+select.isMultiple());
		
		List<WebElement> low = select.getOptions();
		for(int i=0; i<low.size(); i++)
	    select.selectByIndex(i);
		Thread.sleep(4000l);
		select.deselectByIndex(0);
		
		List<WebElement> selectedOptionsList = select.getAllSelectedOptions();//3
		System.out.println("selected option zie : "+selectedOptionsList.size());
		System.out.println("selected option -> ");
		for(WebElement x : selectedOptionsList)
			System.out.println(x.getText());
		
		
		
		
		
		
	}

}
