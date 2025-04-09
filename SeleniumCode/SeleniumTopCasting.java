package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTopCasting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/satishpericherla/Desktop/browser/chromedriver");
		
		//1. chrome/ff/safari/edge
		
		//valid - when test cases need to run only on one browser always
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.close();
		
		//2.
		WebDriver webdriver = new ChromeDriver(); 
		
		//webdriver =  new FirefoxDriver();
		//webdriver =  new SafariDriver(); 
		//webdriver =  new EdgeDriver();
		
		webdriver.manage().window().maximize();
		webdriver.quit();
		
		//3. valid but not useful. only few methods can be accssed from SearchContext
		SearchContext sdriver = new ChromeDriver(); 
		System.out.println(sdriver.getClass());
		
		//4. valid and useful. can cause issues when new browser come up say satish browser
		//WebDriver webdriver = new SatishDriver(); the new driver will implmemt all the methods at web driver level
		//not possible if RemoteWebDriver rdriver = new ChromeDriver(); 
		//https://gyazo.com/577c2ad8dbfe9854d3de5e829e38931c
		
		RemoteWebDriver rdriver = new ChromeDriver(); 
		rdriver.manage().window().minimize();
		rdriver.close();
		
		
		//5. WD <- RWD: valid and useful when testcases need to run on remote machine -- like cloud, server, selenium grid, aws
		//WebDriver wdriver = new RemoteWebDriver(new URL("https://192.190.10.11/wd/hub", capabilites)); capabilites - eg: which chrome browser version etc
		
		//6. SC --- RWD. valid but not useful. only few methods can be accssed from SearchContext
		//7. CD --- Chromium Driver - valid and only useful for Chrome Driver
		
		
		
		
		
		
		
		
		

	}

}
