package week_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_034_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// https://jqueryui.com/resources/demos/droppable/default.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//Draggable id : draggable
		
		WebElement drapable=driver.findElement(By.id("draggable"));
		WebElement drogable=driver.findElement(By.id("dropgable"));
		Actions actions=new Actions(driver);
		//clickHold(),  doubleClick(), dragAndDrop(), keyDown, keyUp, release()
		actions.dragAndDrop(drapable, drogable).build().perform();
		
		
		actions.clickAndHold(drogable).moveToElement(drapable).release().build().perform();
		
		//Build method=build method compile list
		Actions drag_drop=actions.clickAndHold(drogable).moveToElement(drapable).release();
		drag_drop.perform();
		Thread.sleep(5000);
		driver.close();
	}

}
