package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class odev2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		
		// rd1= yes
		// rd2= no
		// buton = reset    /html/body/div[2]/form/p[2]/input[1]
		// buton 2 = buttoncheck     //*[@id="buttoncheck"]
		
		WebElement yess=driver.findElement(By.id("yes"));
		WebElement noo=driver.findElement(By.id("no"));
		
		if (yess.isSelected()) {
			WebElement ressset=driver.findElement(By.xpath("/html/body/div[2]/form/p[2]/input[1]"));
			ressset.click();
			System.out.println("Reset YES secildi.");
		} else if(noo.isSelected()) {
			WebElement checkk=driver.findElement(By.id("buttoncheck"));
			checkk.click();
			System.out.println("Reset No secildi.");
		}
		
	}

}
