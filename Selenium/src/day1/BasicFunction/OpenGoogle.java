package day1.BasicFunction;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		
		String DriverPath="D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", DriverPath);
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		String sourcecode=driver.getPageSource();
		
		//	System.out.println("Application source code: "+sourcecode);
			System.out.println("Source code length: "+sourcecode.length());
			
			System.out.println("Application current URL: "+driver.getCurrentUrl());
			System.out.println("Application current Title: "+driver.getTitle());
	
			driver.close();	
	}
}