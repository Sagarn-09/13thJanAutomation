package day1.BasicFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWaytoOpenFireFoxBrowser {

	public static void main(String[] args) {
		String driverPath1="D:\\Software\\Java\\workspace\\Selenium\\executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver",driverPath1);
		
		WebDriver cdriver=new FirefoxDriver();
		
		
	}

}
