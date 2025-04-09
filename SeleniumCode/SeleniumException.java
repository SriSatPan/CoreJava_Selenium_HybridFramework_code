package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumException {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/");

		// driver.findElement(By.name("search")).sendKeys("macbook pro");

		/*
		 * WebElement ele = driver.findElement(By.name("search11"));//will not find the
		 * element due to wrong xpath. //error -
		 * org.openqa.selenium.NoSuchElementException: no such element: Unable to locate
		 * element: {"method":"css selector","selector":"*[name='search11']"}
		 * //exception - ***NoSuchElementException*** not a selenium but java exception.
		 * 
		 * ele.sendKeys("macbook pro");
		 */

		List<WebElement> footerLinks = driver.findElements(By.xpath("//footer/naveen"));// no excpetion here even though
																						// xpath elemet does not exist.
		System.out.println(footerLinks.size());// 0

		/*
		 * List<WebElement> list = driver.findElements(By.name("search"));
		 * System.out.println(list.size());
		 * 
		 * if (list.size() == 1) {
		 * System.out.println("Single search ele is present on UI"); } else {
		 * System.out.println("No search/Mutiple search ele(s) are present on UI"); }
		 * 
		 * boolean flag = driver.findElement(By.name("search")).isDisplayed();// if more
		 * than two searchs on UI due to a // bug then still be get test case PASS. Not
		 * // recomended!!
		 * 
		 * if (flag) { System.out.println("Single search ele is present on UI"); }
		 */

	}

	public static boolean isSingleElementPresent(By locator) {

		List<WebElement> list = driver.findElements(By.name("search"));
		System.out.println(list.size());

		if (list.size() == 1) {
			System.out.println("Single search ele is present on UI");
			return true;
		} else {
			System.out.println("No search/Mutiple search ele(s) are present on UI");
			return false;
		}

	}

}
