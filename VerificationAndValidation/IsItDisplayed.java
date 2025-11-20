package VerificationAndValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsItDisplayed {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement poll = driver.findElement(By.xpath("(//strong)[5]"));
		if(poll.isDisplayed())
		{
		System.out.println(" Community poll element is displayed and TestCase passed");
		}
		else
		{
			driver.close();
			throw new Exception("Community poll element is not displayed and TestCase failed");
		}
		driver.close();
	}
}