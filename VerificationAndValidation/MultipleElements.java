package VerificationAndValidation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//way to find multiple elements
		//Finding with common Attribute
//		List<WebElement> poll = driver.findElements(By.xpath("//input[@name='pollanswers-1']"));
//		for(WebElement web:poll)
//		{
//			web.click();
//		    Thread.sleep(2000);
//
//		}
//		
		//Finding Elements by using Traversing
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		for(WebElement web:links)
		{
			web.click();
		    Thread.sleep(1000);
		    driver.navigate().back();

		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
//Traversing
//div[@class="header-links"]/ul/li/a