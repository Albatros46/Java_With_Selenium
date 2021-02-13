package week_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_017_DropDown_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options_1=new ChromeOptions();
		
		options_1.addArguments("incognito","headless");
		WebDriver driver=new ChromeDriver(options_1);
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		WebElement ddElement=driver.findElement(By.xpath("//*[@id=`testingDropdown`]"));
		
		Select select=  new Select(ddElement);
		select.selectByIndex(2);
		driver.close();
	}

}
