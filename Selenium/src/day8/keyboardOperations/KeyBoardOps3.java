package day8.keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class KeyBoardOps3 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.flipkart.com/");
	
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		
		/**
		 * possible ways to refresh the browser:
		 * 1. driver.navigate().refresh();
		 * 2. sendKeys(Keys.f5);
		 * 3. by hitting same URL again
		 * 4. ctrl+R
		 */
	}

}
