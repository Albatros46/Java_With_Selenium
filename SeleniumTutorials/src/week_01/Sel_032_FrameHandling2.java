package week_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_032_FrameHandling2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		System.out.println(driver.getTitle());
	
		Thread.sleep(3000);
		driver.switchTo().frame("content");
		
		System.out.println(driver.findElement(By.xpath("/html/body/p[1]")).getText());
		
		//This is swtiching to  default content as what driver started for
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("navbar");
		driver.close();
	}

}
