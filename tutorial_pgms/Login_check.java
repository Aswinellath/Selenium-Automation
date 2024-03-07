package tutorial_pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		
		try {
			WebElement log_ot_btn = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
			if(log_ot_btn.isDisplayed()) {
				log_ot_btn.click();
				System.out.println("Logout Successfull");
			}
		}
		catch (Exception e) {
			//System.out.println("Login incorrect");
			WebElement log_in_btn = driver.findElement(By.xpath("//*[@id=\"login\"]"));
			driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("aswintest");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Aswin123!@#");
			log_in_btn.click();
			System.out.println("Login Successfull");
			String pgtitle= driver.getTitle();
			System.out.println("Title of the page is "+ pgtitle);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			WebElement log_ot_btn = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
			if(log_ot_btn.isDisplayed()) {
				log_ot_btn.click();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			driver.close();
		}
	}
}
