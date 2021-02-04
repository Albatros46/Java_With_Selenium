package week_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		//Projenin kutuphanesine Selenium Library leri ekledikten sonra driver i tanitiyoruz.
		//chrome webdriver ---> https://chromedriver.chromium.org/home
		//geckodriver ---> https://github.com/mozilla/geckodriver/releases
		// Bilgisayarinizin C surucusune sisteminize uygun geckodriver indirin.
		//Porje kutuphanesine (build path) asagidaki linki giriyoruz. (izleyin-> https://www.youtube.com/watch?v=oo8hakhidQM&list=PL6flErFppaj2ArNxLyR4nQ4JV8qFc56-M&index=3
		//https://www.selenium.dev/selenium/docs/api/java/overview-summary.html
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getWindowHandles());
	    System.out.println(driver.getTitle());
	    driver.quit();
	}

}
