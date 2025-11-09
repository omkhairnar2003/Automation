package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("OM");
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastname")).sendKeys("Khairnar");
		Thread.sleep(1000);
		
		driver.findElement(By.id("day")).sendKeys("20");
		Thread.sleep(1000);
		
		driver.findElement(By.id("month")).sendKeys("May");
		Thread.sleep(1000);
		
		driver.findElement(By.id("year")).sendKeys("2003");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[value='2']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("omKhairnar@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("password_step_input")).sendKeys("OmKhairnar");
		Thread.sleep(1000);
		
		driver.close();
	}

}
