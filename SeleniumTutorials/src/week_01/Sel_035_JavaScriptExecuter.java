package week_01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_035_JavaScriptExecuter {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		driver.get("https://todomvc.com/examples/vanillajs/");
		
		driver.findElement(By.xpath("/html/body/section/header/input")).sendKeys("Servet");
		driver.findElement(By.xpath("/html/body/section/header/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/section/header/input")).sendKeys("AKCADAG");
		driver.findElement(By.xpath("/html/body/section/header/input")).sendKeys(Keys.ENTER);
		js.executeScript("document.querySelector('body > section > section > label').click()");
		
		

	}

}
