package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUpHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		// cannot handle this auth pop up. So passing the credentails to handle in the
		// url * admin:admin@ *
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String username="admin";
		String password = "admin";
		
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		String text = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		System.out.println(text);

	}

}
