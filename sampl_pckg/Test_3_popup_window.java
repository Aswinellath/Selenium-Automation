package sampl_pckg;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3_popup_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://midnay.com/");
		driver.manage().window().maximize();
		long timeoutInSeconds = 5;
		String mainWindowHandle = driver.getWindowHandle();
		
		try {
			Thread.sleep(timeoutInSeconds * 1000);
		} catch (InterruptedException e) {
            e.printStackTrace();
        }
		Set<String> windowHandles = driver.getWindowHandles();
		
		if(windowHandles.size() > 1) {
			System.out.println("A pop-up window appeared within the "+ timeoutInSeconds + " seconds time period.");
			
			for(String windowHandle : windowHandles) {
				if(!windowHandle.equals(mainWindowHandle)) {
					driver.switchTo().window(windowHandle);
					driver.close();
					break;
				}
			}
		} else {
			System.out.println("No pop-up window appeared "+ timeoutInSeconds + " seconds time period");
		}
		driver.switchTo().window(mainWindowHandle);
		
	}

}
