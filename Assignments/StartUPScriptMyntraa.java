package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUPScriptMyntraa {
	
  public static void main(String[] args) {
	
	 ChromeDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.myntra.com/");
	 
	 driver.close();
}
}
