package sampl_pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Contact_form_filling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://midnay.com/contact-us/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_1\"]")).sendKeys("QATest");
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_3\"]")).sendKeys("Midnay");
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_16\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_16\"]")).sendKeys("qa@midnay.com");
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_17\"]")).click();
		
//		WebElement dropdownElement3 = driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_17-container\"]/div/div/div/div[2]"));
//		Select dropdown3 = new Select(dropdownElement3);
//		dropdown3.selectByVisibleText("India");
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_17\"]")).sendKeys("9946943642");
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_6\"]")).sendKeys("Test message content");
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_9-container\"]/div/div[1]/div/div")).click();
		WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_9-container\"]/div/div[1]/div/div"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("$2500 - $5000");
		driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_11-container\"]/div/div[1]/div/div")).click();
		WebElement dropdownElement2 = driver.findElement(By.xpath("//*[@id=\"wpforms-3582-field_11-container\"]/div/div[1]/div/div"));
		Select dropdown1 = new Select(dropdownElement2);
		dropdown1.selectByVisibleText("Referred Midnay Clients");
		driver.findElement(By.xpath("//*[@id=\"success-icon\"]/circle")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"wpforms-submit-3582\"]")).click();
	}

}
