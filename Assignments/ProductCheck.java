package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductCheck {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.className("ico-login"));
		login.click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("Email")).sendKeys("omkhairnar@gmail.com");
		Thread.sleep(1000);   
		
		driver.findElement(By.cssSelector("#Password")).sendKeys("omkhairnar");
		Thread.sleep(1000); 
		
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(2000);
		
		String expected_url="https://demowebshop.tricentis.com/";
		
		driver.get(expected_url);
		String actual_url=driver.getCurrentUrl();
		if(expected_url.equals(actual_url))
		{
			System.out.println("i am in targeted webpage");
		}
		else
		{
			System.out.println("i am not in targeted webpage");
			driver.close();
			throw new Exception("Testcase is failed");
		}
		
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Rahul");
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("Rahul@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_SenderName"));
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_SenderEmail"));
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Sending you a small gift card");
		Thread.sleep(1000);
		
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("1");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		Thread.sleep(1000);
		
		String expectedProduct = "$25 Virtual Gift Card";

		String actualProduct = driver.findElement(By.xpath("//a[@class='product-name']")).getText();

		if(actualProduct.equals(expectedProduct)) 
		{
		    System.out.println("Product successfully added to cart!");
		    System.out.println("Test case is passed");
		} 
		else 
		{
		    System.out.println("Product not added!");
		    driver.close();
			throw new Exception("Testcase is failed");
		}
		
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
