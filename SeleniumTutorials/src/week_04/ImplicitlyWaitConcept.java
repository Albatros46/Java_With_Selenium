package week_04;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ImplicitlyWaitConcept {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		// 4
		// NoSuchElementException
		
		// global wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		By username = By.xpath("//form[@id='loginForm']/div/input[@name='username']");
		By pass = By.xpath("//form[@id='loginForm']/div/input[@name='password']");
		
		
		driver.findElement(username).sendKeys("Testing");
		driver.findElement(pass).sendKeys("testpassword");
		
	}

}
