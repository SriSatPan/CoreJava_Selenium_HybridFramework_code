package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser.toLowerCase().trim()) {

		case "chrome":

			System.setProperty("webdriver.chrome.driver", "/Users/satishpericherla/Desktop/browser/chromedriver");
			driver = new ChromeDriver();
			break;

		case "firefox":

			System.setProperty("webdriver.gecko.driver", "/Users/satishpericherla/Desktop/browser/geckodriver");
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the correct browser!!");
			break;

		}

		driver.get("https://google.com");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("Web Page Title: " + title);

		String url = driver.getCurrentUrl();
		System.out.println("Url is: " + url);

		driver.quit();

	}

}
