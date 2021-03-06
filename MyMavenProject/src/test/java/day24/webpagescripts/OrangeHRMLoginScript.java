package day24.webpagescripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import day24.webpages.OrangeHRMLoginPage;
import utilities.SeleniumUtility;

public class OrangeHRMLoginScript extends SeleniumUtility{

	@Test
	public void loginIntoOrangeHRMApp() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		OrangeHRMLoginPage getOrangeHRMLoginPage=new OrangeHRMLoginPage(driver);
		
		getOrangeHRMLoginPage.loginIntoOrangeHRM("Admin", "admin123");
		System.out.println(getOrangeHRMLoginPage.getHomePageTitle());
	}

}
