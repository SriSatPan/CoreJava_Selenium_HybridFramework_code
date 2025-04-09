package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadConcept {

	static WebDriver driver;

	// test url -> https://cgi-lib.berkeley.edu/ex/fup.html - Webpage is not working - Test with a different page

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().window().maximize();
		
		//type="file" for the upload file buttom then below hack will work. Check with various webpages on ecore/Django panel
		
		driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Downloads/AgileDevops.jpeg");
		
		

		

	}

}
