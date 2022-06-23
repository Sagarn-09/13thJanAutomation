package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		String driverPath1 = "D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath1);

		ChromeDriver cdriver = new ChromeDriver();

		cdriver.get("https://www.facebook.com");
		
		System.out.println("Application current URL: " + cdriver.getCurrentUrl());
		 
		System.out.println("Application current Title: " + cdriver.getTitle());
		
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = cdriver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}
		
		cdriver.close();
	}
}
