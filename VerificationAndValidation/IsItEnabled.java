package VerificationAndValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsItEnabled {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.className("ico-login"));
		if(login.isEnabled())
		{
			System.out.println("Login element is enabled and TestCase is passed");
			login.click();
		}
		else 
		{
			driver.close();
			throw new Exception("Login element is not enabled and TestCase is failed");
		}
		driver.close();
	}
}