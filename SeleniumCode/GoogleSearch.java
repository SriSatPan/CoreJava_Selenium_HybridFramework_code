package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		By searchKey = (By.name("q"));
		By suggestions = By.xpath("//div[@class='wM6W7d']/span");
		googleSearch(searchKey, "selenium", suggestions, "selenium testing");

	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static void googleSearch(By searchlocator, String searchkey, By searchsuggestion, String value)
			throws InterruptedException {

		driver.findElement(searchlocator).sendKeys(searchkey);
		Thread.sleep(3000);

		List<WebElement> SuggestedSearchList = driver.findElements(searchsuggestion);
		System.out.println(SuggestedSearchList.size() - 3);

		for (WebElement e : SuggestedSearchList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(value)) {
				e.click();
				break;
			}

		}

	}

}
