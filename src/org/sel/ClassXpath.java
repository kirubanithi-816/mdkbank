package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassXpath {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver contactUs=new ChromeDriver();
			contactUs.get("http://www.greenstechnologys.com/");//lanunch browser
			
		WebElement cont1 = contactUs.findElement(By.xpath("//a[@href='contact.php']"));
		cont1.click();
		
		WebElement Name= contactUs.findElement(By.xpath("//input[@id='InputName']"));
		Name.sendKeys("Kirubanithi");

		WebElement Email=contactUs.findElement(By.xpath("//input[@id='InputEmail1']"));
		Email.sendKeys("nithperfect@gmail.com");
		
		WebElement phone=contactUs.findElement(By.xpath("//input[@id='InputSubject']"));
		phone.sendKeys("9884822824");
		
		WebElement course=contactUs.findElement(By.xpath("((//option[@value='JAVA/J2EE'])[1]"));
		course.click();
		
		WebElement branch=contactUs.findElement(By.xpath("((//option[@value='OMR'])[1]"));
		branch.click();
		
				
		WebElement courseStart=contactUs.findElement(By.xpath("((//option[@value='Immediately'])[1])"));
		courseStart.click();
		
		
		WebElement Message=contactUs.findElement(By.xpath("//textarea[@class='form-control input-message']"));
		Message.sendKeys("Interested to Learn Selenium course");
		
				
	
	
	
	}
}
