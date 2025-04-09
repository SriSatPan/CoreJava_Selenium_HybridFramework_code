package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PseudoElementHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('content')
		// window.getComputedStyle(document.querySelector("label[for='input-lastname']"),'::before').getPropertyValue('content')
		
		
		String fn_Jscritp = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";
		
		checkElementIsMandatory(fn_Jscritp);

	}

	public static boolean checkElementIsMandatory(String jsScript) {

		JavascriptExecutor js = (JavascriptExecutor) driver; // type casting driver as JavascriptExecutor
		String man_text = js.executeScript(jsScript).toString();
		// the script retuns a character * this time.

		System.out.println(man_text);

		if (man_text.contains("*")) {

			System.out.println("Element is a mandatory Field");
			return true;

		} else {

			System.out.println("Element is not a mandatory Field");
			return false;
		}

	}

}
