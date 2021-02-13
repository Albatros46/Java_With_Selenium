package week_01;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_016_DropDown_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options_1=new ChromeOptions();
		options_1.addArguments("headless");
		WebDriver driver=new ChromeDriver(options_1);
		
		driver.get("https://facebook.com/r.php");
		WebElement ddMonElement=driver.findElement(By.xpath("//select[@id=`month`]"));
		Select ddMonthMenu=new Select(ddMonElement);
		
		ddMonthMenu.selectByVisibleText("Sep");
		ddMonthMenu.deselectByIndex(12);
		
		List<WebElement> options=ddMonthMenu.getOptions();
		ArrayList<String> arraylist=new ArrayList<String>();
		for(int i=0;i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		
		for(int i=0;i<arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
	}

}
