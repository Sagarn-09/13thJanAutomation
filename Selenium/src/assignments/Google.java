package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		String driverPath1 = "D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath1);

		ChromeDriver cdriver = new ChromeDriver();

		cdriver.get("https://www.google.com");
		
		System.out.println("Application current Title: " + cdriver.getPageSource());
		
		System.out.println("Application current URL: " + cdriver.getCurrentUrl());
		 
		System.out.println("Application current Title: " + cdriver.getTitle());
		
		cdriver.close();
	}

}
