package org.sel;

import javax.xml.soap.Text;
import java.lang.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	
	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver cont1=new ChromeDriver();
		cont1.get("http://www.greenstechnologies.in/selenium-training.php");//lanunch browser
		
		
		WebElement wb=cont1.findElement(By.xpath("//p[contains(text(),'Greens Technology, Rated')]"));
		String t1=wb.getText();
		System.out.println(t1);
		
		WebElement wb1=cont1.findElement(By.xpath("//p[contains(text(),'Learn ')]"));
		String t2=wb1.getText();
		System.out.println(t2);
}
}