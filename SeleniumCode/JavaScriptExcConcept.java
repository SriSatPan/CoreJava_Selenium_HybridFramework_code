package SeleniumSessions;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExcConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//Browser -- understnads only JavaScript!
		//Crome Driver class extends remote webdriver implements webdriver interface!
		//Webdriver interfcae implements java script executor!
		//java script executor  uses exceuteScript()
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.ecoreservice.com/auth/login?isLoginRedir=true");
		//driver.get("https://amazon.com");
		driver.manage().window().maximize();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("alert('hello ecore')");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		//jsUtil.generateAlert("Hello Ecore");
		//jsUtil.generateConfirmPopUp("Hello Ecore");
		
		//Thread.sleep(5000);
		
		//jsUtil.refreshBrowserByJS();//history.go(0)//page refresh
		
		//String pagetext = jsUtil.getPageInnerText(); //gets all page text
		//System.out.println(pagetext);
		//System.out.println(pagetext.contains("Api Docs"));//validation
		
		String title = jsUtil.getTitleByJS();
		System.out.println(title);
		
		WebElement GetStarted = driver.findElement(By.xpath("//button[text()='Get Started']"));
		jsUtil.clickElementByJS(GetStarted); // Click from DOM not preferred since end user will not click this way!
		
		//jsUtil.flash(GetStarted); //flash the element
		
		/*Thread.sleep(2000);
		jsUtil.scrollPageDown();
		Thread.sleep(2000);
		jsUtil.scrollPageUp();//will not work for infinite scroll. */
		
		WebElement emailinput = driver.findElement(By.xpath("//input[@type ='email']"));
		emailinput.sendKeys("satish@ecoreservice.com");
		
		
		WebElement passwordinput = driver.findElement(By.xpath("//input[@type ='password']"));
		passwordinput.sendKeys("PerSat4123*");
		
		WebElement signinbtn= driver.findElement(By.xpath("//button[text() ='Sign in']"));
		jsUtil.clickElementByJS(signinbtn);
		
		Thread.sleep(10000);
	
		
		WebElement legalsearch= driver.findElement(By.xpath("//div[text()='Legal-Search']"));
		jsUtil.scrollIntoView(legalsearch);
		
	
	
	}

}
