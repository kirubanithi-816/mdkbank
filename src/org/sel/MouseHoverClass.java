package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class MouseHoverClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KiruSugu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
	Thread.sleep(4000);
	
		WebElement WE=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(WE).perform();
		
		WebElement WE1=diver
		
	}
	
}
