package org.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KiruSugu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement src=driver1.findElement(By.id("credit2"));
	
	WebElement des= driver1.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		
		Actions acc=new Actions(driver1);
		acc.dragAndDrop(src, des).perform();
		
		Thread.sleep(2000);
		WebElement src1=driver1.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement des1=driver1.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		acc.dragAndDrop(src1,des1).perform();

		Thread.sleep(2000);
		WebElement src3=driver1.findElement(By.xpath("//li[@id='credit1']"));
		WebElement des3=driver1.findElement(By.xpath("(//div[@class='ui-widget-content'])[4]"));
		acc.dragAndDrop(src3, des3).perform();
		
		
		Thread.sleep(2000);
		WebElement src2=driver1.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement des2=driver1.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
		acc.dragAndDrop(src2,des2).perform();
		
		
	}

}
