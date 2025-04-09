package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// usecase
		// open browser: chrome
		// launch url: amazon.com
		// get the title
		// verify the title : act vs exp
		// close the browser

		// architecture image -> https://gyazo.com/7f05ceabdaf72a6a81a1b7d7d5080c15
		// topcasting https://gyazo.com/d7b5964289150c6ae218ede2360b8e3e

		// executable file which acts as server is needed for each browser
		// https://gyazo.com/05613b8f4bd15115f71c66698ed4193f
		
		//Automation Steps
		System.setProperty("webdriver.chrome.driver", "/Users/satishpericherla/Desktop/browser/chromedriver");
		WebDriver driver = new ChromeDriver(); // open chrome
		// Webdriver is the Interface
		// driver is the reference variable
		// ChromeDriver() is the class.
		// object is RHS - new ChromeDriver();
		// Topcasting - Child class object is referenced by parent Interface reference
		// variable

		driver.manage().window().maximize(); // maximize the browser window

		driver.get("https://www.amazon.com");// open amazon.com --- including www. is a good practice
		// if https:// is not given then we get an InvalidArgumentException: invalid argument

		String title = driver.getTitle(); // get the title of the web page to verify
		// title is the tab name of the browser once a url is accessed.

		
		
		String source = driver.getPageSource();
		//System.out.println("Source is: "+ source);
		
		String url = driver.getCurrentUrl();//capture url
		System.out.println("Url is: "+ url);
		
		// verification - check point
		
		if (source.contains("Conditions of Use")) {
			
			System.out.println("Test Passed...Conditions of Use exist on page");
			
		} else {
			
			System.out.println("Test Failed..no Conditions of Use found");
			
		}
		
		if (title.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Web Page Title: " + title);
			System.out.println("Test Passed");
			driver.quit(); //close the browser. driver.close();
		} else {
			System.out.println("Test Failed. Please check the title on the open browser...");
		}
	}
}
