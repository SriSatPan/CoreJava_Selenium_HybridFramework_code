package SeleniumSessions;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/satishpericherla/Desktop/browser/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//driver.get("https://amazon.com");
		//driver.navigate().to("https://amazon.com");
		
		driver.navigate().to(new URL("https://amazon.com"));
		System.out.println(driver.getTitle());
		
		//driver. get and driver.naviagate.to are synanomyms of each other as per documentation.
		//only the impementation is different.
		//driver.navigate.to calls get method internally
		
		//ctrl+shift+O fixes the import issues
	
		//cannot do back and forward with get method
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();//page refresh
		System.out.println(driver.getTitle());
		
	    driver.quit();
		
		

	}

}
