package day8.keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class KeyBoardOps1 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.flipkart.com/");
		//using Escape of keyboard to avoid login popup
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
	
	}

}
