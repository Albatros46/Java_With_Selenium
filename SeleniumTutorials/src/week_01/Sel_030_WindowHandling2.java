package week_01;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_030_WindowHandling2 {

	public static void main(String[] args) throws InterruptedException {
		
		/*   //*[@id="j1_24_anchor"]
		 *   //*[@id="j1_27_anchor"]
		 *   //*[@id=“practice5-3”]/div[2]/div[1]/div/div[2]/div[1]/a
		 * 
		 * 
		 * 
	     */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.bobit.us/Practice");
		driver.findElement(By.xpath("//*[@id='j1_24']/i")).click();
		driver.findElement(By.xpath("//*[@id='j1_27_anchor']")).click();
		driver.findElement(By.id("followall")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> windowHandleList = new ArrayList<String>(windowHandles);
		System.out.println(windowHandleList);
		
		String practicePage = windowHandleList.get(0);
		String linkedinPage = windowHandleList.get(1);
		String twitterPage = windowHandleList.get(2);
		String instagram = windowHandleList.get(3);
	
		driver.switchTo().window(practicePage);
		driver.switchTo().window(linkedinPage);
		driver.switchTo().window(twitterPage);
		driver.switchTo().window(instagram);
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getCurrentUrl());
		
		
		Thread.sleep(4000);
		driver.quit();

	}

}
