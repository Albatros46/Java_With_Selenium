package week_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_016_DropDown_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/r.php");
		WebElement ddMonElement=driver.findElement(By.xpath("//select[@id=`month`]"));
		Select ddMonthMenu=new Select(ddMonElement);
		ddMonthMenu.deselectByIndex(12);
		ddMonthMenu.selectByVisibleText("Sep");
	}

}
