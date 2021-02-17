package odev;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class odev4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		//id : tabButton
		WebElement newTabBtn=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a")); 
		newTabBtn.click();
		Thread.sleep(3000);
		
		
		WebElement newWindowBtn=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/a"));
		newWindowBtn.click();
		Thread.sleep(3000);
		
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
