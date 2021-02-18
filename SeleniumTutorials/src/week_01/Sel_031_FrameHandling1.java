package week_01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_031_FrameHandling1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chase.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Shows the List of the frame other functionality
		List<WebElement> iframe=driver.findElements(By.tagName("iframe"));
		System.out.println(iframe.size());
		
		// 1) Switch to the iframe with index number
	//	driver.switchTo().frame(0);
		// 2) Switch to the iframe id or name (Frame´s id ) 
		driver.switchTo().frame("logonbox");
		
		//Username id : userId-text-input-field
		driver.findElement(By.id("userId-text-input-field")).sendKeys("Servet");;
		
		//Pasword : password-text-input-field
		driver.findElement(By.id("password-text-input-field")).sendKeys("12345679");;
		
		//Sign in button : signin-button
		driver.findElement(By.id("password-text-input-field"));
		
		Thread.sleep(7000);
		driver.close();
	}

}
