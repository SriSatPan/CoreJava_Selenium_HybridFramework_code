package SeleniumSessions;

import java.time.Duration;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitleConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://test.ecoreservice.com/auth/login?redirectTo=%2Fsaas%2Fdatacore");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		if (wait.until(ExpectedConditions.titleContains("Team Without"))) {

			System.out.println(driver.getTitle());

		}

		if (wait.until(ExpectedConditions.titleIs("DataCore - Team Without Borders"))) {

			System.out.println(driver.getTitle());

		}

	}

	public static String waitForTitleContains(int timeout, String titleFraction) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {

			return driver.getTitle();

		} else {

			return null;
		}

	}

	public static String waitForTitleIs(int timeout, String title) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		if (wait.until(ExpectedConditions.titleIs(title))) {

			return driver.getTitle();

		} else {

			return null;
		}

	}

}
