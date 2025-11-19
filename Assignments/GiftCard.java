package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		
		List<WebElement> poll = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement web:poll)
		{
			web.click();
			Thread.sleep(2000);

			driver.findElement(By.className("recipient-name")).sendKeys("Rahul");
			Thread.sleep(1000);
			driver.findElement(By.className("sender-name")).sendKeys("OM");
			Thread.sleep(1000);

			List<WebElement> recEmail = driver.findElements(By.className("recipient-email"));
			if(recEmail.size() > 0) {
			    recEmail.get(0).sendKeys("Rahul@gmail.com");
			}
			Thread.sleep(1000);

			List<WebElement> senderEmail = driver.findElements(By.className("sender-email"));
			if(senderEmail.size() > 0) {
			    senderEmail.get(0).sendKeys("omkhairnar@gmail.com");
			}
			Thread.sleep(1000);

			driver.findElement(By.className("message")).sendKeys("Sending you a small gift card");
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			}
		Thread.sleep(3000);
		driver.close();
	}
}
