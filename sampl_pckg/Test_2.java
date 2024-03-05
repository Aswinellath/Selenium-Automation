package sampl_pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Midnay");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		//WebElement firstArticleLink = driver.findElement(By.cssSelector("//*[@id=\"kp-wp-tab-overview\"]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
		driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/div/cite")).click();
		String expectedArticleUrl = "https://midnay.com/";
		if(driver.getCurrentUrl().contains(expectedArticleUrl)) {
			System.out.println("The expected article URL is present.");
		} else {
			System.out.println("The expected article URL isn't present");
		}
	}

}
