package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleElementsConcept {

	public static void main(String[] args) {
		
		// single element - findElement - returns WebElement
		// Multiple elements - findElements - returns List<WebElement>
		
		//use case total no of links/images/buttons avaiable on the page
		//print the text of each link on the console
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		System.out.println("no of links: "+linksList.size());
		
		/*for (int i=0; i<(linksList.size()); i++) {
			
			String text = linksList.get(i).getText();
			if(text.length()!=0) {
				System.out.println(text);
			}
			
			
		}*/
		
		for (WebElement e:linksList) {
			
			String text = e.getText();
			
			if(text.length()!=0) {
				System.out.println(text);
			}
			
			String hrefVal = e.getAttribute("href");
			System.out.println(hrefVal);
		}

	}

}
