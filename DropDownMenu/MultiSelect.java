package DropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/OM/Downloads/demo-1.html");
		Thread.sleep(2000);
		
		WebElement multiSelect=driver.findElement(By.id("multiple_cars"));
		Select sel=new Select(multiSelect);
		sel.selectByVisibleText("Audi");
		Thread.sleep(1000);
		sel.selectByValue("bmw");
		Thread.sleep(1000);
		sel.selectByIndex(3);
		
		Thread.sleep(4000);
		driver.close();
	}
}
