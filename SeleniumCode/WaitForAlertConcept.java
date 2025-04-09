package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();

		/*
		 * JavaScriptUtil jsUtil = new JavaScriptUtil(driver); //String title =
		 * jsUtil.getTitleByJS(); //System.out.println(title);
		 * 
		 * WebElement GetStarted =
		 * driver.findElement(By.xpath("//button[text()='Get Started']"));
		 * jsUtil.clickElementByJS(GetStarted); // not recomended for using js script
		 * for webelement clicks.
		 * 
		 * WebElement emailinput =
		 * driver.findElement(By.xpath("//input[@type ='email']"));
		 * emailinput.sendKeys("satish@ecoreservice.com");
		 * 
		 * WebElement passwordinput =
		 * driver.findElement(By.xpath("//input[@type ='password']"));
		 * passwordinput.sendKeys("PerSat4123*");
		 * 
		 * WebElement signinbtn =
		 * driver.findElement(By.xpath("//button[text() ='Sign in']"));
		 * jsUtil.clickElementByJS(signinbtn);
		 * 
		 * By Settingstext = By.xpath("//span[text()='Settings']"); By updatePassword =
		 * By.xpath("//div[text()='Update Password']");
		 * 
		 * WebElement SettingsOption = waitForElementVisible(Settingstext, 10);
		 * jsUtil.clickElementByJS(SettingsOption);
		 * 
		 * WebElement updatePasswordBTN = waitForElementVisible(updatePassword, 10);
		 * jsUtil.clickElementByJS(updatePasswordBTN);
		 */

		driver.findElement(By.name("proceed")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		System.out.println(alert.getText());
		alert.accept();
		driver.switchTo().defaultContent();

	}

	public static WebElement waitForElementVisible(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	// JS Alert + Wait

	public static Alert waitforAlert(int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public static String getAlertText(int timeOut) {

		return waitforAlert(timeOut).getText();

	}

	public static void accpetAlert(int timeOut) {

		waitforAlert(timeOut).accept();

	}

	public static void dismissAlert(int timeOut) {

		waitforAlert(timeOut).dismiss();

	}
	
	public static void alertSendKeys(int timeOut, String value) {

		waitforAlert(timeOut).sendKeys(value);

	}
	
	

}
