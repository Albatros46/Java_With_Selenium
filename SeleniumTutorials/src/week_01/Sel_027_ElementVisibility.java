package week_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_027_ElementVisibility {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		//RadioButton 1,2
		WebElement rb1=driver.findElement(By.id("vfb-7-1"));
		WebElement rb2=driver.findElement(By.id("vfb-7-2"));
		//CheckBoxbutton 1
		WebElement cb1=driver.findElement(By.id("vfb-6-0"));
		cb1.click();
		rb1.click();
		System.out.println("Radiobutton 1 secildi ? :"+rb1.isSelected());
		System.out.println("Radiobutton 2 secildi ? :"+rb2.isSelected());
		System.out.println("CheckBoxbutton 1 secildi ? :"+cb1.isSelected());
		System.out.println("CheckBoxbutton 1 secildi ? :"+cb1.isEnabled());
		System.out.println("CheckBoxbutton 1 secildi ? :"+cb1.isDisplayed());
	}

}
