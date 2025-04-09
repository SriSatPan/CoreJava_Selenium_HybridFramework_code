package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) throws Exception {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("Chrome");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		eleUtil.doSendKeys(email,"satish.periche@gmail.com");
		eleUtil.doSendKeys(password, "PerSat4123$");
		
		brUtil.closeBrowser();

	}

}
