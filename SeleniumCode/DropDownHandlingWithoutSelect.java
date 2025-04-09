package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingWithoutSelect {// Select class is avaiable and should not be used. No sendkeys should to be
											// used as well.

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/en/30-day-free-trial");

		By country = By.xpath("//select/option");
		doSelectValueFromDropDown(country, "Armenia");//linear search not recommended when select tag is avaiable.

	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

		public static void doSelectValueFromDropDown(By locator, String Value) {
	
			List<WebElement> optionsList = getElements(locator);
			System.out.println(optionsList.size());
	
			for (WebElement e : optionsList) {
	
				String optionsListText = e.getText();
				System.out.println(optionsListText);
	
				if (optionsListText.equals(Value)) {
	
					e.click();
					break;// since it's inside a for loop. Break cannot be used in only if statement.
	
				}
	
			}
	
		}

}
