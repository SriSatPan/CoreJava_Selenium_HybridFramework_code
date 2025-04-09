package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementHandling {
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {//not used in 6th approach
		
		return driver.findElement(locator);
		
	}
	
	public static void doSendKeys(By locator, String value) {//not used in 6th approach
		
		getElement(locator).sendKeys(value);
		
	}
	
	public void doClick(By locator) {

		getElement(locator).click();

	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create a webelement
		//perform an action (click,sendkey,select, isDisplayed, gettext etc)
		
		//1st Approach
		
		/*driver.findElement(By.id("input-email")).sendKeys("satish.periche@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("PerSat4123$");*/
		
		//2nd Approach
		
		/*WebElement emailID = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		
		emailID .sendKeys("satish.periche@gmail.com");
		password.sendKeys("PerSat4123$");*/
		
		//3rd Approach - By locator
		// only the web elemets need to work with will send server requests.
		
		//Object repository
		/*By email = By.id("input-email");
		By password = By.id("input-password");
		
		WebElement emailId = driver.findElement(email);
		WebElement pwd = driver.findElement(password);
		
		emailId .sendKeys("satish.periche@gmail.com");
		pwd.sendKeys("PerSat4123$");*/
		
		//4th approach
		//by locator with generic function
		
		/*By email = By.id("input-email");
		By password = By.id("input-password");
		
		getElement(email).sendKeys("satish.periche@gmail.com");
		getElement(password).sendKeys("PerSat4123$");*/
		
		//5th Aproach
		//by locator and get element with generic functions 
		
		
		/*By email = By.id("input-email");
		By password = By.id("input-password");
		
		doSendKeys(email,"satish.periche@gmail.com");
		doSendKeys(password,"PerSat4123$");*/
		
		//6th Approach
		//By locator with Element util and generic functions
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		eleUtil.doSendKeys(email,"satish.periche@gmail.com");
		eleUtil.doSendKeys(password, "PerSat4123$");
		eleUtil.doClick(loginBtn);
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		//driver.quit();
		
		//7th Approach - Login page test
		
		
        }

}
