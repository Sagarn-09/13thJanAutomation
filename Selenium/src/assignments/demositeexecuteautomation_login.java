package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demositeexecuteautomation_login {

	public static void main(String[] args) {

		String driverPath1 = "D:\\Software\\Java\\workspace\\Selenium\\executables\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", driverPath1);

		FirefoxDriver cdriver = new FirefoxDriver();

		cdriver.get("https://demosite.executeautomation.com/Login.html");

		String sourcecode = cdriver.getPageSource();

		System.out.println("Application current URL: " + cdriver.getCurrentUrl());
	 
		System.out.println("Application current Title: " + cdriver.getTitle());

		String expectedTitle = "Execute Automation";
		String actualTitle = cdriver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}

	//	cdriver.findElement(By.tagName("input")).sendKeys("execution");
	//or
		cdriver.findElement(By.name("UserName")).sendKeys("execution");
		
		cdriver.findElement(By.name("Password")).sendKeys("admin");

		cdriver.findElement(By.name("Login")).click();

		// driver.close();
	}
}

/*
 * Scenario to Automate: Launch a new firefox browser. 
 * Open - https://demosite.executeautomation.com/Login.html 
 * Get Page Title name and 
 * Title length Print Page Title and 
 * Title length on the Eclipse Console.
 * Get Page URL and verify if it is a correct page opened 
 * Enter username as “execution” Enter password as “admin” 
 * Click on login button Get the page
 * title and current URL,
 * print on console Click on logout 
 * Close the Browser.
 */