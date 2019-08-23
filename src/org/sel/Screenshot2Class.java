package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Screenshot2Class {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KiruSugu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		TakesScreenshot tk1=(TakesScreenshot)driver;
		
		File src1 = tk1.getScreenshotAs(OutputType.FILE);
		
		File des1= new File("C:\\Users\\KiruSugu\\eclipse-workspace\\Selenium\\Screenshot\\third.png");
		FileUtils.copyFile(src1,des1);
		
		
		
		
		
		
		
	}
	
}
