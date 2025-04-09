package SeleniumSessions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForURL {
	
    static WebDriver driver;

	public static void main(String[] args) {
		
	    WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://test.ecoreservice.com/auth/login?redirectTo=%2Fsaas%2Fdatacore");
		
		
		By ContactUsBtn = By.xpath("//button[text()='Contact us']");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.waitForElementPresence(ContactUsBtn, 10).click();
		
		//driver.findElement(ContactUsBtn).click();
	
		//swicth to latest tab that is open
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		String url = waitForUrl(10,"contact-us-2");
		System.out.println(url);
		
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		if(wait.until(ExpectedConditions.urlContains("contact-us-2"))) {
			
			System.out.println(driver.getCurrentUrl());
			
		}*/

	}
	
	public static String  waitForUrl(int timeout, String urlFraction) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
        if(wait.until(ExpectedConditions.urlContains( urlFraction))) {
			
			return driver.getCurrentUrl();
			
		}
        
        else 
        	
        	return null;
	}

}
