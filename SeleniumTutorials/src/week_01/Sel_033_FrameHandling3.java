package week_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_033_FrameHandling3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		//Headless made (Run selenium program without openin a browser)
		//Chromeoption argument called (headles)
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://www.siliconelabs.com/");
		System.out.println(driver2.getTitle());
		driver2.close();
		
		// https://mvnrepository.com/artifact/org.seleniumhq.selenium/htmlunit-driver/2.43.1
		// adresinden HtmlUnit Driver i pom.xml eklemeliyiz.
		
		
		FirefoxOptions options2=new FirefoxOptions();
		options2.setHeadless(true);
		options2.addArguments("--headless--");
		WebDriver driver3 = new FirefoxDriver();
		driver3.get("http://www.facebook.com/");
		System.out.println(driver3.getTitle());
		driver3.close();
		
		System.exit(0);
	}

}
