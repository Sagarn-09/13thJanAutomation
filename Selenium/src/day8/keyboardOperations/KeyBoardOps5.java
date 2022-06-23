package day8.keyboardOperations;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class KeyBoardOps5 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.flipkart.com/");
	
		try {
			WebElement element = driver.findElement(By.xpath("//body"));
			element.sendKeys(Keys.ESCAPE);
		}catch(NoSuchElementException e) {
			
		}
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		/**
		 * possible ways to refresh the browser:
		 * 1. driver.navigate().refresh();
		 * 2. sendKeys(Keys.f5)
		 * 3. by hitting same URL again
		 * 4. ctrl+R
		 */
	}

}
