package SeleniumSessions;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMElementHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();

		Thread.sleep(15000);

		// driver.findElement(By.id("kils")).sendKeys("Teddy"); - will not work because of shawdow DOM. Needs JavascriptExecutor.
		//If shadown DOM is closed then cannot be automated

		// document.querySelector("#userName").shadowRoot.querySelector("#kils")

		JavascriptExecutor js = (JavascriptExecutor) driver; // type casting driver as JavascriptExecutor
		WebElement name = (WebElement) js
				.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\")");
		// typcasting the returning DOM element to Webelement

		name.sendKeys("teddy");

	}

}
