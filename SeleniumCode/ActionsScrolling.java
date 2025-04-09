package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsScrolling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatools.ecoreservice.com/admin/login/?next=/admin/");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By email = By.name("username");
		By password = By.name("password");
		By loginBtn = By.xpath("//*[@id=\"login-form\"]/div[3]/input");
		
		eleUtil.doSendKeys(email,"Satish");
		eleUtil.doSendKeys(password, "P3FF9NPhWn");
		eleUtil.doClick(loginBtn);
		
		Actions act = new Actions(driver);
		
		//scroll page down
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(1000);
		
		//scroll page Up
		act.sendKeys(Keys.PAGE_UP).build().perform();
	}

}
