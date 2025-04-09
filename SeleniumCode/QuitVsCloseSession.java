package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSession {

	public static void main(String[] args) {

		// quit vs close driver

		System.setProperty("webdriver.chrome.driver", "/Users/satishpericherla/Desktop/browser/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com");

		String title = driver.getTitle();

		System.out.println("Web Page Title: " + title);

		driver.quit();  
		
		//System.out.println(driver.getTitle()); // selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	
		driver.close();
		
		//System.out.println(driver.getTitle()); //selenium.NoSuchSessionException: invalid session id. session id here is the same as it was at aline no 29. 
		//session id not null as in quit()..IMP.
		

	}

}
