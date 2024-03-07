package tutorial_pgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://shop.demoqa.com/";
		driver.get(url);
		String pageTitle = driver.getTitle();
		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageTitle + " and the length of the title is " + pageTitle.length());
		System.out.println(pageUrl);
		if(pageUrl.matches(url)) {
			System.out.println("The URL matches");
		}
		else {
			System.out.println("URL mismatch");
		}
//		if(url==pageUrl) {
//			System.out.println("The URL matches");
//		}
//		else {
//			System.out.println("The URL mismatches");
//		}
		int lengthsrc = driver.getPageSource().length();
		System.out.println(lengthsrc);
		driver.quit();
	}

}
