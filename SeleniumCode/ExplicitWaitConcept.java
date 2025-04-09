package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// explicit wait
		// it's applied for a specific element, not all elements
		// not a global wait
		// can be used for non web elements as well.
		// polling/Interval

		// webdriver wait
		// fluent wait

		// WebDriverWait (C) -- extends -- FluentWait(C) --- implements -- Wait(I) -
		// until() abstract method;

		// FluentWait(C) -- until() -- @overide + other methods.

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://test.ecoreservice.com/auth/login?redirectTo=%2Fsaas%2Fdatacore");
		driver.manage().window().maximize();

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		String title = jsUtil.getTitleByJS();
		System.out.println(title);

		WebElement GetStarted = driver.findElement(By.xpath("//button[text()='Get Started']"));
		jsUtil.clickElementByJS(GetStarted); // not recomended for using js script for webelement clicks.

		WebElement emailinput = driver.findElement(By.xpath("//input[@type ='email']"));
		emailinput.sendKeys("satish@ecoreservice.com");

		WebElement passwordinput = driver.findElement(By.xpath("//input[@type ='password']"));
		passwordinput.sendKeys("PerSat4123*");

		WebElement signinbtn = driver.findElement(By.xpath("//button[text() ='Sign in']"));
		jsUtil.clickElementByJS(signinbtn);

		By legalsearch = By.xpath("//div[text()='C_Level_Search']");
		By darkModetext = By.xpath("//div[text()='Dark Mode']");

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// WebElement legalsearchaval =
		// wait.until(ExpectedConditions.presenceOfElementLocated(legalsearch));

		WebElement legalsearchaval = waitForElementPresence(legalsearch, 15);
		jsUtil.scrollIntoView(legalsearchaval);

		// WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(1));
		// WebElement darkModetextaval =
		// wait1.until(ExpectedConditions.presenceOfElementLocated(darkModetext));

		WebElement darkModetextaval = waitForElementPresence(darkModetext, 5);
		jsUtil.scrollIntoView(darkModetextaval);

		boolean flag = darkModetextaval.isDisplayed();
		System.out.println(flag);

		By dataCore = By.xpath("//span[text()='DataCore']");
		By supressionList = By.xpath("//button[text()='My Suppression Lists']");
		By searchList = By.xpath("//input[@placeholder='Search lists']");
		By Actiontag = By.xpath("//div[text()='Action']");

		WebElement DataCoreval = waitForElementPresence(dataCore, 10);
		jsUtil.clickElementByJS(DataCoreval);

		WebElement supressionListval = waitForElementPresence(supressionList, 5);
		jsUtil.clickElementByJS(supressionListval);

		waitForElementVisible(Actiontag, 10);
		waitForElementPresence(searchList, 5).sendKeys("Brian");

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	// Presence in DOM vs Visibility.

	// An expectation for checking that an element is present on the DOM of a page.
	// This does not necessarily mean that the element is visible.
	public static WebElement waitForElementPresence(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	// An expectation for checking that an element is present on the DOM of a page
	// and visible.
	// Visibility means that the element is not only displayed but also has a height
	// and width that is greater than 0.

	public static WebElement waitForElementVisible(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

}
