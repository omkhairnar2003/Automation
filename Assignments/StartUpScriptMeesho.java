package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScriptMeesho {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/?srsltid=AfmBOoqWv1eq3hgcUD1zd-MOpBVf0IjVoQy4Oztrzqg93xOUlV7IFBXW");
		
		driver.close();
	}
}
