package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		/*String attrvalue = driver.findElement(By.id("input-email")).getAttribute("placeholder");
		System.out.println(attrvalue);*/
		
		/*WebElement emailID = driver.findElement(By.id("input-email"));
		emailID.sendKeys("satish.periche@gmail.com");
		
		String text = emailID.getAttribute("value");
		System.out.println(text);*/
		
		By emailId = By.id("input-email");
		By registerLink = By.linkText("Register");
		By logoImage = By.className("img-responsive");
		
		String text1 = DoGetAttribute(emailId,"placeholder");
		String text2 = DoGetAttribute(registerLink,"href");
		String text3 = DoGetAttribute(logoImage,"src");
		String text4 = DoGetAttribute(logoImage,"title");
		
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);
		
		driver.quit();
	}
	
	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}
	
	public static String DoGetAttribute(By locator, String name ){
		
		return getElement(locator).getAttribute(name);
		
	}
	
	

}
