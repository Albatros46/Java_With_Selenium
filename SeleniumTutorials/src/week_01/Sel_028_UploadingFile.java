package week_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_028_UploadingFile {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//Upload File Button
		WebElement uploadBtn=driver.findElement(By.name("upFile"));
		//Path of the file
		uploadBtn.sendKeys("/albat/Desktop/cv_eksikleri.txt");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		
		
		Thread.sleep(7000);
		driver.close();

	}

}
