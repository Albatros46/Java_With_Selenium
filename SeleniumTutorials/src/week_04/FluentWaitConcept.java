package week_04;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By username = By.xpath("//form[@id='loginForm']/div/input[@name='username']");
		By pass = By.xpath("//form[@id='loginForm']/div/input[@name='password']");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)) // MAX amount of time
				.pollingEvery(Duration.ofSeconds(5)) // every 5 seconds
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys("Testing");
				
	}

}
