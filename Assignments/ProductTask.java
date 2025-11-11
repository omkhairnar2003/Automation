package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Rahul");
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("Rahul@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("OM");
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("omkhairnar@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Sending you a small gift card");
		Thread.sleep(1000);
		
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div[2]/div/form/div/div/div[2]/div[6]/div/input[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("removefromcart")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("updatecart")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}