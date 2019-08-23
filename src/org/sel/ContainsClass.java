package org.sel;

import java.lang.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsClass {
	
	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver cont=new ChromeDriver();
		cont.get("http://www.greenstechnologies.in/selenium-training.php");//lanunch browser
		
		WebElement para3= cont.findElement(By.xpath("//p[contains(text(),'Our')]"));
		String text=para3.getText();
		System.out.println(text);
		
		
		
	}
	

}
