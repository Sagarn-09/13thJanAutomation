package day2.BasicLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) {
		String driverPath = "D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
//		WebElement usernameinputfield=driver.findElement(By.id("user-name"));
//		usernameinputfield.sendKeys("standard_user");
					//or
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
	}

}
