package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// context click Or right click

		// Test Website - https://swisnl.github.io/jQuery-contextMenu/demo.html

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		WebElement rightClkEle = driver.findElement(By.cssSelector("span.context-menu-one"));

		Actions act = new Actions(driver);
		act.contextClick(rightClkEle).build().perform();

		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li/span")); // cmd+shf+2
																														// shortcut

		System.out.println(options.size());

		for (WebElement e : options) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals("Copy")) {
				e.click();
				break;
			}

		}

	}

}
