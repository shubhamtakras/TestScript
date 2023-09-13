package day9May23;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 {

	public static void main(String[] args) {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		List<String> expAl = new ArrayList<>() {
		{
			add("Radio Button Example1");
			add("CheckBox Example2");
			add("Switch Window Example3");
			add("Switch Tab Example");
			add("Select Class Example");
			add("Multiple select Example");
			add("Auto Suggest Example");
			add("Enable/Diabled Example");
			add("Element Displayed Example");
			add("Switch To Alert Example");
			add("Mouse Hover Example");
			add("Web Table Example");
			add("iFrame Example");
		}
	};
		List<WebElement> lwe = driver.findElements(By.xpath("//legend"));
		List<String>actAl = new ArrayList<>();
		for(WebElement we : lwe)
		{
			actAl.add(we.getText());
			System.out.println(we.getText());	
		}
		boolean res = actAl.equals(actAl);
		if(res)
			System.out.println("Test Case Passed !!!");
		else
		{
			System.out.println("Test Case Failed !!");
			actAl.retainAll(expAl);
			expAl.remove(actAl);
			System.out.println(expAl);
		}	
	driver.quit();
	}
	

}
