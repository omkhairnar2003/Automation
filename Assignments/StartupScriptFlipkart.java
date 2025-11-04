package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartupScriptFlipkart {

	 public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.close();
	}
	}
