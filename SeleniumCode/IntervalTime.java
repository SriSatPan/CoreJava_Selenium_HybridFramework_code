package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IntervalTime {// also called polling time
	// 10 secs with 500 millisecs means it checks every 500 millisecs so browser is
	// hit 20 times in 10 secs.
	// 10/0.5 = 20.
	// can we customise the interval time? Yes.

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://test.ecoreservice.com/auth/login?redirectTo=%2Fsaas%2Fdatacore");

		By ContactUsBtn = By.xpath("//button[text()='Contact us']");

		// ElementUtil eleUtil = new ElementUtil(driver);
		// eleUtil.waitForElementPresence(ContactUsBtn, 10).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ContactUsBtn)).click();

	}

}
