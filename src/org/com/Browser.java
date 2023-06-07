package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\SeleniumTesting\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		
		Thread.sleep(2000);

		

		WebElement email = driver.findElement(By.id("email"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("arguments[0].setAttribute('style','background:green;border:solid 5px red')",email);



	}
}
