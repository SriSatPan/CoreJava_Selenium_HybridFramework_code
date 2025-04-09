package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		//WDM - third part lib
		//browser version mangement
		// https://github.com/bonigarcia/webdrivermanager
		//https://bonigarcia.dev/webdrivermanager ---- Documentation
		
		//after adding the depdency in the pom.xml file
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		driver.quit();
		
		
		
		

	}

}
