package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger_login {

	public static void main(String[] args) {
		String driverPath = "D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Test@123");

		driver.findElement(By.className("button")).click();
	//or	
	//	driver.findElement(By.className("buttonBlue")).click();

	}

}

/*
https://demo.vtiger.com/vtigercrm/index.php
username: admin
password: Test@123

open a chrome browser
enter vtiger application url--https://demo.vtiger.com/vtigercrm/index.php
validation login page open or not
remove existing text from username field
type username as 'admin'
remove existing text from password field
type password as 'Test@123'
click on login button
*/