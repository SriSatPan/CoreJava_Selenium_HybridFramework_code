package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeFullScreen {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize(); //gives a full screen based on screen size.
		
		driver.manage().window().fullscreen(); //does not give the full window. It's depdendant on the OS.
		driver.get("https://google.com");
		
		driver.quit();
		

	}

}
