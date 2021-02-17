package week_01;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_029_WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		//id : tabButton
		WebElement newTabBtn=driver.findElement(By.id("tabButton"));
		newTabBtn.click();
		
		WebElement newWindowBtn=driver.findElement(By.id("windowButton"));
		newWindowBtn.click();
		
		
		//Get the handlers
		System.out.println(driver.getWindowHandles());
	    Set<String> windowsHandles=driver.getWindowHandles();
	    ArrayList<String> windowsHandleList=new ArrayList<String>(windowsHandles);
	    String parentWindow=windowsHandleList.get(0);
	    String childWindows=windowsHandleList.get(1);
	    String newWindow=windowsHandleList.get(2);
	    
	    driver.switchTo().window(newWindow);
	    System.out.println(driver.getCurrentUrl());
	    
	    Thread.sleep(3000);
		driver.close();
		
	}

}
