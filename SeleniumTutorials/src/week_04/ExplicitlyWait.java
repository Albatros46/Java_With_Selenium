package week_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExplicitlyWait {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dollartree.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		// wait.until(ExpectedConditions.titleContains("Glass"));
		
		wait.until(ExpectedConditions.titleIs("Glass Vases, Party Supplies, Cleaning & More | DollarTree.com"));
		
		
		
	}

}
