package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger_Signout {

	public static void main(String[] args) {
		String driverPath = "D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
	//	driver.findElement(By.id("username")).sendKeys("admin");

	//	driver.findElement(By.name("password")).sendKeys("Test@123");

		driver.findElement(By.className("button")).click();
	//or	
	//	driver.findElement(By.className("buttonBlue")).click();
		
		driver.findElement(By.partialLinkText("Sign")).click();
		
	//	driver.close();
	}

}

/*
open a chrome browser
enter vtiger application url--https://demo.vtiger.com/vtigercrm/index.php
type username as 'admin'
type password as 'Test@123'
click on login button
verify
sign-out
*/