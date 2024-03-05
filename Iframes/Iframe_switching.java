package Iframes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_switching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		// using javascript
//		JavascriptExecutor exe = (JavascriptExecutor) driver;
//		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
//		System.out.println("No. of iframes on the page are " + numberOfFrames);
		driver.switchTo().frame(1);
	}

}
