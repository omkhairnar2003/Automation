package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComputerRemove {

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
		
		String expected_title="Demo Web Shop";
		String actual_title=driver.getTitle();
		if(expected_title.equals(actual_title))
		{
			System.out.println("Targeted title fetched");
		}
		else
		{
			System.out.println("Targeted title didnt fetched");
			driver.close();
			throw new Exception("Test case failed");
		}
		
		driver.findElement(By.xpath("(//input)[13]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='product_attribute_16_3_6_18']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='product_attribute_16_4_7_20']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='product_attribute_16_8_8_22']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='product_attribute_16_8_8_24']")).click();
		Thread.sleep(1000);
		
		WebElement clear=driver.findElement(By.xpath("//input[@id='addtocart_16_EnteredQuantity']"));
		clear.clear();
		clear.sendKeys("3");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-16']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//span)[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("removefromcart")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("updatecart")).click();
		Thread.sleep(3000);
		
		String expectedProduct = "Your Shopping Cart is empty!";
		
		String actualProduct = driver.findElement(By.xpath("//div[@class='order-summary-content']")).getText();
		
		if(actualProduct.equals(expectedProduct)) 
		{
		    System.out.println("Product successfully removed from cart!");
		    System.out.println("Test case is passed");
		} 
		else 
		{
		    System.out.println("Product not removed!");
		    driver.close();
			throw new Exception("Testcase is failed");
		}
		
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}