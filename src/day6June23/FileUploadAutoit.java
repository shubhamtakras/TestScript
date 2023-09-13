package day6June23;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadAutoit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.monsterindia.com/seeker/registration?spl=IN-Acq-SEM-Google-Core_Brand_Old_BMM_Web_S-GSN-Core_Brand_Old-%2Bmonster-desktop-Brand---388396137523---CPC-6645446156&utm_campaign=IN_Acq_SEM-Google-Core_Brand_Old_BMM_Web_S-GSN-Core_Brand_Old-%2Bmonster-&utm_medium=SEM&utm_source=Google-GSN-CPC&utm_term=SEM_%2Bmonster&gclid=CjwKCAjw8KmLBhB8EiwAQbqNoC6kJ8TSNKOabGn59JegPBGPFv5h_qYAoyom5vp17qUnmWk7fLsT3xoCG2QQAvD_BwE");
		
		driver.findElement(By.xpath("//div[@class='uploadResume']")).click();
		try {
			Runtime.getRuntime().exec("C:\\Users\\91744\\OneDrive\\Desktop\\FileUpload.exe"+" "+"C:\\Users\\91744\\OneDrive\\Documents\\SHUBHAM.PDF");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
		
		
	}

}
