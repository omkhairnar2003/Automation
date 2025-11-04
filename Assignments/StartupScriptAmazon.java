package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartupScriptAmazon {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
		driver.get("https://www.google.com/aclk?sa=L&ai=DChsSEwiRuNLCh9aQAxW0uksFHd48HiEYACICCAEQABoCc2Y&co=1&ase=2&gclid=CjwKCAiAwqHIBhAEEiwAx9cTeYMLF32AOwzl0lwgXijEJ98W0M-Kxj4QxQ5NPuswZLqTURJOXmJsXBoC7lwQAvD_BwE&cid=CAASlwHkaBq_9JopWQNNkTvRChlb2j_sB_pxk16xphKa8LJGnuimSxezMyfolSVMb1v-m7kzEjzQfb4aAkPQSBlbbCfCLSHXc7aUMtxUfUESdlO9qIMK55vu-bLj6ocFada-X_ZG8FLaDhQPv9lKy4BWfTuLS-fTgOhQ05ZZ9h7p5yPDKn0GQP90rBkGaHyyxZZwS5F-Avw2A-4u&cce=2&category=acrcp_v1_32&sig=AOD64_2Cipz5ytwtXn9ei8kdLPwNKCaqqw&q&nis=4&adurl&ved=2ahUKEwia-crCh9aQAxUeyDgGHcgVE7EQ0Qx6BAgMEAE");
		
		driver.close();
		
	}
}