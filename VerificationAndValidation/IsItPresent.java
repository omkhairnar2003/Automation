package VerificationAndValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsItPresent {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.className("register"));
			System.out.println("Element is present");
		} catch(Exception e)
		{
			driver.close();
			throw new Exception("TestCase fail because register element is not present..");
		}
		driver.close();
	}

}
