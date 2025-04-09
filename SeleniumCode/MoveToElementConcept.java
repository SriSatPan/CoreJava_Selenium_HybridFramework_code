package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		By language = By.xpath("//div[text()='EN']");
		By LanguageOptions = By.xpath("//span[text()='español']");

		handleLevel1MenuItems(language, LanguageOptions);

	}

	public static WebElement getElement(By Locator) {

		return driver.findElement(Locator);

	}

	public static void handleLevel1MenuItems(By parentMenu, By childMenu) throws InterruptedException {

		Actions act = new Actions(driver);

		// mouse over action

		act.moveToElement(getElement(parentMenu)).build().perform();

		Thread.sleep(3000);

		getElement(childMenu).click();

	}

	public static void handleLevel2MenuItems(By parent1Menu, By parent2Menu, By childMenu) throws InterruptedException {

		Actions act = new Actions(driver);

		// mouse over action

		act.moveToElement(getElement(parent1Menu)).build().perform();
		Thread.sleep(3000);

		act.moveToElement(getElement(parent2Menu)).build().perform();
		Thread.sleep(3000);

		getElement(childMenu).click();

	}//try with bigbasket.com - shop by category -> Level4 with above code.
}
