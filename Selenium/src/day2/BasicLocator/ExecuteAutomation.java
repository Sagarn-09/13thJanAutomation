package day2.BasicLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteAutomation {

	public static void main(String[] args) {
		String driverPath = "D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		driver.findElement(By.name("Username")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
	}
}

 
// all locator is correct but we have find another locators