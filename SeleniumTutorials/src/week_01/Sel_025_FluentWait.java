package week_01;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_025_FluentWait {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		 
		 //Start button id:start
		 driver.findElements(By.xpath("//*[@id=\"start\"]/button"));
		 
		 FluentWait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
				 .pollingEvery(Duration.ofSeconds(2))
				 .ignoring(NoSuchElementException.class);
		 
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='finish']/h4"))));
	
	}

}
