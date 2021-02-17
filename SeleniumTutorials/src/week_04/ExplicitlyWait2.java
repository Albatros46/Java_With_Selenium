package week_04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ExplicitlyWait2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);	// 0.5 seconds of polling every		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
	}

}
