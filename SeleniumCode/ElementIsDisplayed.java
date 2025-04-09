package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://amazon.com");

		/*
		 * boolean flag =
		 * driver.findElement(By.id("twotabsearchtextbox")).isDisplayed(); if (flag) {
		 * 
		 * System.out.println("element is displayed");
		 * 
		 * } else {
		 * 
		 * System.out.println("element is displayed");
		 * 
		 * }
		 */

		By searchField = By.id("twotabsearchtextbox");
		By searchBtn = By.id("nav-search-submit-button");

		if (doElementIsDisplayed(searchField)) {

			System.out.println("element is displayed");
			getElement(searchField).sendKeys("macbookpro");
			getElement(searchBtn).click();
			

		} else {

			System.out.println("element is displayed");

		}

		//driver.quit();

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static boolean doElementIsDisplayed(By locator) {

		return getElement(locator).isDisplayed();

	}
	
	public static void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);

	}
	
	public static void doClick(By locator) {

		getElement(locator).click();

	}

}
