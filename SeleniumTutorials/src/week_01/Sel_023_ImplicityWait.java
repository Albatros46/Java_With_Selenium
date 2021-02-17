package week_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_023_ImplicityWait {

	 public static void main(String[] args) throws InterruptedException 
	 {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 //Start button id:start
		 driver.findElements(By.xpath("//*[@id=\"start\"]/button"));
		 
		 
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='finish']/h4"))));
	    wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
	    System.out.println(driver.findElement(By.xpath("//*[@id='finish']/h4")).getText());
	 
	    driver.close();
	 }
}
