package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");

		/*
		 * List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		 * System.out.println("no of images: "+imagesList.size());
		 * 
		 * //src and alt for (WebElement e : imagesList) {
		 * 
		 * String srcVal = e.getAttribute("src"); String altVal = e.getAttribute("alt");
		 * 
		 * System.out.println(srcVal + ":" + altVal);
		 * 
		 * 
		 * }
		 */

		By links = By.tagName("a");
		By Images = By.tagName("img");

		System.out.println("no of links: " + getElementsCount(links));
		System.out.println("no of images: " + getElementsCount(Images));

		ArrayList<String> linkstextlist = getElementsTextList(links);
		ArrayList<String> imgtextlist = getElementsTextList(Images);
		
		System.out.println(linkstextlist);
		System.out.println(imgtextlist);
		
		

	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public static int getElementsCount(By locator) {

		return getElements(locator).size();

	}

	public static ArrayList<String> getElementsTextList(By locator) {

		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();

		for (WebElement e : eleList) {

			String text = e.getText();
			
			if (text.length()!= 0) {
				
				eleTextList.add(text);
				
			}

		}

		return eleTextList;

	}

}
