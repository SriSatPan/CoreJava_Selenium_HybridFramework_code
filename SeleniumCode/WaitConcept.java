package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConcept {

	public static void main(String[] args) {
		
		//wait: sync
		
		//static wait : Thread.sleep(5000) - 5 secs wait always!!
		//dynamic wait : 10 secs but wait no needed after 2 secs then 8 mins wait is cancelled
		
		//implicitly wait
		
		//explicit wait
		  //webdriver wait
		  //fluent wait
		
		
		//implicitly wait  
		  //1. global wait
		  //2. It is applied to all webelements by default
		  //3. applied after the driver decalartion
		  //4. Not recomended. Never used in a framework!
		  //5. Even if element does not exists it will throw excpetion only after the defined wait period.
		  //6. Does not support non web elements like title, url, alerts etc.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1)); // 1sec wait check applied to all elements until a override of wait time or driver.quit statement
		
		driver.get("https://test.ecoreservice.com/auth/login?redirectTo=%2Fsaas%2Fdatacore");
		driver.manage().window().maximize();
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		String title = jsUtil.getTitleByJS();
		System.out.println(title);
		
		WebElement GetStarted = driver.findElement(By.xpath("//button[text()='Get Started']"));
		jsUtil.clickElementByJS(GetStarted);
		
		WebElement emailinput = driver.findElement(By.xpath("//input[@type ='email']"));
		emailinput.sendKeys("satish@ecoreservice.com");
		
		
		WebElement passwordinput = driver.findElement(By.xpath("//input[@type ='password']"));
		passwordinput.sendKeys("PerSat4123*");
		
		WebElement signinbtn= driver.findElement(By.xpath("//button[text() ='Sign in']"));
		jsUtil.clickElementByJS(signinbtn);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//overriding by 10 secs
		
		WebElement legalsearch= driver.findElement(By.xpath("//div[text()='Legal-Search']"));
		jsUtil.scrollIntoView(legalsearch); //checking 10 secs wait for even above 4 elements also which is not needed!! 
		//wait is ignored since element is present but still the check reduces performance
		
		
		
		
		
		
		
		
		
	}

}
