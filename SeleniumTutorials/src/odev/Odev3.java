package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Odev3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.name("firstName")).sendKeys("Servet");
		driver.findElement(By.name("lastName")).sendKeys("AKCADAG");
		driver.findElement(By.name("phone")).sendKeys("145263455");
		driver.findElement(By.name("userName")).sendKeys("Servet46");
		driver.findElement(By.name("address1")).sendKeys("Pforzheim");
		driver.findElement(By.name("city")).sendKeys("Stuttgart");
		driver.findElement(By.name("state")).sendKeys("Almanya");
		driver.findElement(By.name("postalCode")).sendKeys("75179");
		
		WebElement ddElement=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
		Select select=  new Select(ddElement);
		select.selectByValue("NICARAGUA");
		driver.findElement(By.name("submit")).click();	
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
