package SeleniumSessions;

import java.util.ArrayList;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementsSectionLinks {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		/*List<WebElement> sectionLinks = driver.findElements(By.className("list-group-item"));
		System.out.println(sectionLinks.size());
		
		for (WebElement e:sectionLinks) {
			
			System.out.println(e.getText());
			
		}*/
		
		By sectionLinks = By.className("list-group-item");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		ArrayList<String> sectionLinksList= eleUtil.getElementsTextList(sectionLinks);
		System.out.println(sectionLinksList);
		
		if (sectionLinksList.contains("Order History")) {
			
			System.out.println("PASS");
			
		}

	}

}
