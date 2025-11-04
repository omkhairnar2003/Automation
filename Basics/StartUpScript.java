package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript {
	
 public static void main(String[] args) {
	
	 //Open the Browser
	 ChromeDriver driver= new ChromeDriver();
	 
	 //maximize the Browser
	 
	 driver.manage().window().maximize();
	 
	 //Enter into DemoWebShop
	 driver.get("https://demowebshop.tricentis.com/");
	 
	 //Close the Browser
	 driver.close();
}
}
