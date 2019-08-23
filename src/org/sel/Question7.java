package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KiruSugu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver Q7=new ChromeDriver();
	Q7.get("https://www.google.com/");
	
	WebElement wp2=Q7.findElement(By.xpath("//input[@type='text']"));
	wp2.sendKeys("greens velmurugan");
	
	Thread.sleep(10000);
	WebElement wp3=Q7.findElement(By.xpath("(//input[@aria-label='Google Search'])[1]"));
	wp3.click();
	
	}
	
	
}
