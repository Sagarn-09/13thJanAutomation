package day1.BasicFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWaytoOpenAnyBrowser {

	public static void main(String[] args) {
		String geckoDriverPath="D:\\Software\\Java\\workspace\\Selenium\\executables\\geckodriver.exe";
		String chromeDriverPath="D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";
				
		openBrowser(geckoDriverPath, "firefox");
		
		openBrowser(chromeDriverPath, "chrome");
	}			
	static void openBrowser(String driverPath, String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath);
			WebDriver driver=new ChromeDriver();
		
		} else if(browserName.equalsIgnoreCase("firefox")) {	
			System.setProperty("webdriver.gecko.driver", driverPath);
			WebDriver driver=new FirefoxDriver();
		}
	}
}
