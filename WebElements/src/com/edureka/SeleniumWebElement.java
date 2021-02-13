package com.edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebElement {

	public static void main(String[] args) throws InterruptedException {
		
		//Driverimizin bulundugu adresi belirtiyoruz.
		System.setProperty("webdriver.chrome.driver", "D:\\Uygulamalar\\Edureka\\WebElements\\WebDriver\\chromedriver.exe");
		
		//Driver objesi olusturuldu.
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/"); //yönlendrirecegimiz adres.
		/*Yonlendirecegimiz sayfadaki web elementlerinin kaynak kodunda elementin ID ve Name bilgilerini kullanacagiz.
		 * 
		 * */
		driver.manage().window().maximize();//tam sayfa olarak acilmasini saglayaycak
		Thread.sleep(10000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");//Kaynak koddan arama cubugunun id bakilip yazildi send key ile aratmak istedigimiz  seyi yazdik
		Thread.sleep(10000);
		driver.findElement(By.className("nav-input")).click(); //Yine kaynak koddan arama dügmesinin class name bakilip yazdik arama dügmeseine tiklattik.
	
		driver.findElement(By.linkText("ACM")).click();//web sitesindeki filtreleme checkboxini isaretleyecek.
		driver.navigate().to("https://www.linkedin.com/in/servet46kcdg/");//benim sayfama gidip 4 saniye gosterdikten sonra tekrar amazon sayfasini görüntüleyecek
		Thread.sleep(4000);
		driver.navigate().back();
		driver.quit();
	}

}
