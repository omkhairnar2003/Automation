package VerificationAndValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFieldVerification {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String expected_data="hoodie";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement searchfield = driver.findElement(By.xpath("//input[@name='q']"));
		searchfield.sendKeys(expected_data);
		String actual_data = searchfield.getAttribute("value");
		System.out.println("searchfield data is :"+actual_data);
		if(expected_data.equals(actual_data))
		{
			System.out.println("data is same and TestCase pass");
		}
		else
		{
			driver.close();
			throw new Exception("data is not same and TestCase fail");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
