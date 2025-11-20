package VerificationAndValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsItSelected {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		excellent.click();
	
		if(excellent.isSelected())
		{
			System.out.println("Excellent elememt is selected and TestCase is pass");
		}
		else
		{
			driver.close();
			throw new Exception("Excellent elememt is not selected and TestCase is fail");
		}
		driver.close();
	}

}
