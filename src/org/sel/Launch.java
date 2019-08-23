package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		
//Configure the browser
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://infinity.icicibank.com/corp/Login.jsp");//lanunch browser
		
WebElement txtsrc=driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
txtsrc.sendKeys("kirubanithi");

WebElement txtpass=driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
txtpass.sendKeys("kiru1234");

	
//title webpage
		
		String ti=driver.getTitle();
		System.out.println("Title is "+ti);
			
//Current URL
		
		String url=driver.getCurrentUrl();
		System.out.println("URL is" +url);
		
		
	}

}
