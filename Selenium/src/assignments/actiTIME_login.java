package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTIME_login {
	public static void main(String[] args) {
		String DriverPath = "D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", DriverPath);

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/");

		String sourcecode = driver.getPageSource();

		String expectedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.id("loginButton")).click();

		// System.out.println("Application source code: "+sourcecode);
		System.out.println("Source code length: " + sourcecode.length());

		System.out.println("Application current URL: " + driver.getCurrentUrl());
		System.out.println("Application current Title: " + driver.getTitle());

		System.out.println("title name: " + expectedTitle);
		System.out.println("title code length: " + expectedTitle.length());

		System.out.println("get Title length: " + driver.getTitle().length());

		driver.close();
	}
}

/*
Scenario to Automate:
Launch a new Chrome browser.
Open https://demo.actitime.com/
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Enter valid username and password
Click on login button
Print the title on the console
Close the Browser.
 */