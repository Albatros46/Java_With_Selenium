package week_01;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_026_FluentWait_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(12))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>(){

			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.id("demo"));
				String text = element.getText();
				if (text.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println(text);
					return element;
				} else {
					System.out.println("Text is not as expected");
					return null;
				}
			}
		
		});
		
		
	}
}
