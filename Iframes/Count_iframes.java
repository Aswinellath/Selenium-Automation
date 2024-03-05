package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Count_iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
        
        //Number of Frames on a Page
        int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of Frames on a Page:" + countIframesInPage);
        
        //Locate the frame1 on the webPage
        WebElement frame1=driver.findElement(By.id("frame1"));
        
        //Switch to Frame1
        driver.switchTo().frame(frame1);
        
        //Locate the Element inside the Frame1
        WebElement frame1Element= driver.findElement(By.tagName("body"));
        
        //Get the text for frame1 element
        String frame1Text=frame1Element.getText();
        System.out.println("Frame1 is :"+frame1Text);
        
        //Number of Frames on a Frame1
        int countIframesInFrame1 =driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);
        
        //switch to child frame
        driver.switchTo().frame(0);
        
        int countIframesInFrame2 =driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);
        
        driver.close();
}
	}


