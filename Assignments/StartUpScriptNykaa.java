package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScriptNykaa {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nykaa.com/");
		
		driver.close();
	}
}
