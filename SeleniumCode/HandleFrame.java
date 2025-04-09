package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2);//frame 3 it is also a web element tag name frame.
		//index can always change - so not recomended to use.
		
		//driver.switchTo().frame("main"); //by string like name or id
		
		driver.switchTo().frame(driver.findElement(By.name("main")));// by web element
		
		//frame is introduced to procted data on the UI by dev's
		// two types of frames - frame and iflame - frame is decprecated and not used any more
		
		String header = driver.findElement(By.xpath("/html/body/h2")).getText(); 
		System.out.println(header);

		
	}

}
