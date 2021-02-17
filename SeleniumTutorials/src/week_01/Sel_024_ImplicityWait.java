package week_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_024_ImplicityWait {

	public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/dynamic-properties");
		 
		 //wait maximum given second until element is visible in the html
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.id("visibleAfter")).click();
		 
		 driver.close();
	}

}
