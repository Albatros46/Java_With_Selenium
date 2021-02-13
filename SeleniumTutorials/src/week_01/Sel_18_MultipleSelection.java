package week_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_18_MultipleSelection {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options_1 = new ChromeOptions();
		
		options_1.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(options_1);
		
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		List<WebElement> options = driver.findElements(By.className("comboTreeItemTitle"));
		for (int i = 0; i < options.size(); i++) {
			if(!options.get(i).getText().equals("")){
			System.out.println(options.get(i).getText());
			options.get(i).click();
			}
		}
		
		//*[@id="comboTree490919DropDownContainer"]/ul/li[2]/span[2]
		//*[@id="comboTree490919DropDownContainer"]/ul/li[2]/span[2]

	}

}
