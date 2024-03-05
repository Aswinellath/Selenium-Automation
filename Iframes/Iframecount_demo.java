package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframecount_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
        
        //Find the total number of iframes on the page
        int totalIFramesOnPage=driver.findElements(By.tagName("iframe")).size();
        
        //Print the total iframes on page
        System.out.println("Total iframes on Page:"+totalIFramesOnPage);
        
        //switch to first frame using index=0
        driver.switchTo().frame(0);
        
        driver.close();

	}

}
