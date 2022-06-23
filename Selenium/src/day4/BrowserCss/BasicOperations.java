package day4.BrowserCss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicOperations {

	public static void main(String[] args) throws InterruptedException {

		String driverPath = "D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);
	//	WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().browserVersion("102.0.5005.61").setup();
		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.manage().window().setSize(new Dimension(500, 700));
		Thread.sleep(2000);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Current Page title is: " + driver.getTitle());

		System.out.println("Current page url: " + driver.getCurrentUrl());
		// or
		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.navigate().to("https://www.amazon.in/");

		driver.close();	

	}
}
