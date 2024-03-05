package sampl_pckg;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_4_popupwindow_occurtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://midnay.com/");
		driver.manage().window().maximize();
		LocalDateTime startTime = LocalDateTime.now();
		
		while(true) {
			Set<String>windowHandles = driver.getWindowHandles();
			
			if(windowHandles.size()>1) {
				LocalDateTime popUpTime = LocalDateTime.now();
				Duration duration = Duration.between(startTime, popUpTime);
				System.out.println("Pop-up appeared after " + duration.toSeconds() + " seconds.");
				for(String windowHandle : windowHandles) {
					if (!windowHandle.equals(driver.getWindowHandle())) {
						driver.switchTo().window(windowHandle);
						driver.close();
						break;	
					}
				}
				break;
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
