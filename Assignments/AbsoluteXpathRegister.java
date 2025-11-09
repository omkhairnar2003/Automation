package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathRegister {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div/div/input")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Om");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Khairnar");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("omkhairnar@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys("omkhairnar");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("omkhairnar");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}
