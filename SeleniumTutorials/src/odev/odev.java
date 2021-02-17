package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class odev {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement uploadBtn=driver.findElement(By.name("uploadfile_0"));
		uploadBtn.sendKeys("C:\\Users\\albat\\Desktop/osi-model-overview-543.pdf");
		
		WebElement cbox=driver.findElement(By.id("terms"));
		cbox.click();
		System.out.println("Söylesme satlari kabul edildi."+cbox.isEnabled());
		
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click(); // //*[@id="submitbutton"]
		Thread.sleep(5000);
		driver.close();
	}

}
