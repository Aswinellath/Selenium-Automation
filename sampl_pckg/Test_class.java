package sampl_pckg;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Midnay");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys("Midnay");
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		//driver.quit();
		String searchedText = "WordPress";
		if(driver.getPageSource().contains(searchedText)) {
			System.out.println("Text: "+ searchedText + " is present in the search result.");
		}
		else {
			System.out.println("Text: "+ searchedText + " is not present in the search result.");
		}
	}

}
