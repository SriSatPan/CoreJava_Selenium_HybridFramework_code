package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * this method is used to initialise the driver on basis of the browser name
	 * 
	 * @param browser
	 */
	public WebDriver launchBrowser(String browser) {

		System.out.println("browser name is: " + browser);

		switch (browser.toLowerCase().trim()) {
		

		case "chrome":

			//System.setProperty("webdriver.chrome.driver", "/Users/satishpericherla/Desktop/browser/chromedriver");
			WebDriverManager.chromedriver().setup(); //~/.cache/selenium has the exe file now.
			driver = new ChromeDriver();
			break;

		case "firefox":

			//System.setProperty("webdriver.gecko.driver", "/Users/satishpericherla/Desktop/browser/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the correct browser!!");
			break;

		}
		
		return driver;

	}

	public void launchUrl(String url) throws Exception {

		if (url == null) {

			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}
		

		if (url.indexOf("http")!=0 && url.indexOf("https")!=0){

			System.out.println("http(s):// is missing");
			throw new Exception("HTTP(S)MISSINGEXCEPTION");
		}

		driver.get(url);
		driver.manage().window().maximize();

	}
	
	public void launchUrl(URL url) throws Exception {
		
		String newURL = String.valueOf(url); 

		if (newURL == null) {

			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (newURL.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}
		

		if (newURL.indexOf("http")!=0 && newURL.indexOf("https")!=0){

			System.out.println("http(s):// is missing");
			throw new Exception("HTTP(S)MISSINGEXCEPTION");
		}

		driver.navigate().to(url);
		driver.manage().window().maximize();

	}


	//wapper function - cutome method created over a driver method
	public String getPageTitle() {

		String title = driver.getTitle();

		System.out.println("page title: " + title);

		if (title != null) {
			return title;
		} else {
			System.out.println("getting null title...");
			return null;

		}
	}
	
	public String getPageUrl() {

		String url = driver.getCurrentUrl();

		System.out.println("current url: " + url);

		if (url != null) {
			return url;
		} else {
			System.out.println("getting null url...");
			return null;

		}
	}
	
	public void closeBrowser() {
		
		if (driver!=null) {
			
			driver.close();
			System.out.println("browser is closed..");
		
		}
		
	}
	
	public void quitBrowser() {
		
		if (driver!=null) {
			
			driver.quit();
			System.out.println("browser is closed..");
		}
		
	}
	
	

}
