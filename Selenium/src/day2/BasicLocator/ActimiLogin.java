package day2.BasicLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActimiLogin {

	public static void main(String[] args) {
		String driverPath = "D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		// identify the required element from the UI
		WebElement userNameInputField = driver.findElement(By.id("username"));
		// perform appropriate action the identified element
		userNameInputField.sendKeys("admin234567");

		// remove existing text from the input field
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");

		// identify the required element from the UI
	//	WebElement passwordInputField = driver.findElement(By.name("pwd"));
		// perform appropriate action the identified element
	//	passwordInputField.sendKeys("manager");

	//or	
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		// identify the required element from the UI
	//	WebElement loginButton = driver.findElement(By.id("loginButton"));
		// perform appropriate action the identified element
	//	loginButton.click();
	//or
		driver.findElement(By.id("loginButton")).click();
	}
}
