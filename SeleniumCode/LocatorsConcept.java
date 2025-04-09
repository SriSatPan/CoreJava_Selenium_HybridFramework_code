package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// total 8 locators are vaiable.
		// 1.id - Done. id is always unquie in HTML hence more preferred than name -I

		// 2.name: can be duplicate in HTML -II

		/*
		 * driver.findElement(By.name("email")).sendKeys("satish.periche@gmail.com");
		 * driver.findElement(By.name("password")).sendKeys("PerSat4123$");
		 */

		// By.type - NA.

		// 3. className: most of the times is duplicate. Avoid using className.
		// className is separated by a space -III
		// when duplicates are found then the first top-don approach element will be
		// worked upon by selenium

		// driver.findElement(By.className("form-control")).sendKeys("satish.periche@gmail.com");

		// 4. link Text: applicable only for links.
		// html tag - <a> - anchor tag

		// driver.findElement(By.linkText("Login")).click();

		// 5. partial Link text : applicable only for links.

		// driver.findElement(By.partialLinkText("Forgotten")).click(); //risk if there
		// is a forgotten user name first on webpage instead of forgotten password
		// when link text is long we use this example - hi this is my login link then
		// driver.findElement(By.partialLinkText("my login")).click();

		// 6. xpath - is not an attribute
		// addres of the wbe element on the page (DOM)
		// id or xpath. id unique then always id. xpath has special usecases as well.
		// not comparable!!

		// driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("satish.periche@gmail.com");

		// 7. css selector:
		// driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Pericherla");
		// xpath vs css - will see soon!

		// 8. tag name:
		// html tag - not an attribute - mostly duplicate - not preferred

		// driver.findElement(By.tagName("input")).sendKeys("test");//org.openqa.selenium.ElementNotInteractableException:
		// element not interactable error

		// used only when capturing certain text when the tag is uquie like below:

		/*
		 * String headertext = driver.findElement(By.tagName("h1")).getText();
		 * System.out.println(headertext);//Register Account
		 */

		/*By header = By.tagName("h1");
		By recpayment = By.linkText("Recurring payments");*/
		
		By warningMesg = By.className("alert");
		By continueBt = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		/*String actHeader = doGetText(header);
		System.out.println(actHeader);
		
		String recpaymentText = doGetText(recpayment);
		System.out.println(recpaymentText);*/
		
		doClick(continueBt);
		
		String warningMesgText = doGetText(warningMesg);
		System.out.println(warningMesgText);

		/*if (actHeader.equals("Register Account")) {

			System.out.println("Correct Header");

		} else {

			System.out.println("Correct Header");n

		}*/
		
		driver.quit();

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static String doGetText(By locator) {

		return getElement(locator).getText();

	}
	
	public static void doClick(By locator) {

		getElement(locator).click();

	}

}
