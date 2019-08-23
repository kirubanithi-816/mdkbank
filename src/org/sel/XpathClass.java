package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver AutoDemo=new ChromeDriver();
		AutoDemo.get("http://demo.automationtesting.in/Register.html");//lanunch browser
			
			WebElement firstName = AutoDemo.findElement(By.xpath("//input[@ng-model='FirstName']"));
			firstName.sendKeys("Kirubanithi");
			
			WebElement lastName = AutoDemo.findElement(By.xpath("//input[@ng-model='LastName']"));
			lastName.sendKeys("Mathi");
			
			WebElement address = AutoDemo.findElement(By.xpath("//textarea[@ng-model='Adress']"));
			address.sendKeys("Saidapet, Chennai");
			
			WebElement email = AutoDemo.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
			email.sendKeys("Kirubanithi@gmail.com");
			
			WebElement phone = AutoDemo.findElement(By.xpath("//input[@ng-model='Phone']"));
			phone.sendKeys("8979878978");
			
			WebElement gender = AutoDemo.findElement(By.xpath("//input[@value='Male']"));
			gender.click();
			
			
			WebElement Hobbies = AutoDemo.findElement(By.xpath("//input[@value='Movies']"));
			Hobbies.click();
			
			
			
			

		
	}
	

}
