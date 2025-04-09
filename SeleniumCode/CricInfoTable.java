package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/rachael-heyhoe-flint-trophy-2024-1427805/southern-vipers-vs-northern-diamonds-12th-match-1427817/full-scorecard");
		driver.manage().window().maximize();

		Thread.sleep(5000);

		// getWckTakerName("Ella McCaughan");
		// getWckTakerName("Linsey Smith");

		/*
		 * List<WebElement> scorelist = driver.findElements(By.
		 * xpath("//span[text()='Ella McCaughan']/ancestor::td/following-sibling::td"));
		 * 
		 * for (WebElement e:scorelist) {
		 * 
		 * String text = e.getText(); System.out.println(text); }
		 */

		//getUserInfo("Linsey Smith");
		getUserInfo("Ella McCaughan");

	}

	public static ArrayList<String> getUserInfo(String batterName) {

		List<WebElement> scoreList = driver
				.findElements(By.xpath("//span[text()='" + batterName + "']/ancestor::td/following-sibling::td"));
		ArrayList<String> scoreListValues = new ArrayList<String>();
		for (WebElement e : scoreList) {

			String text = e.getText();
			System.out.println(text);
			scoreListValues.add(text);

		}

		return scoreListValues;

	}

	public static String getWckTakerName(String batterName) {

		String wkt_xpath = "//span[text()='" + batterName + "']/ancestor::td/following-sibling::td";
		String wTakerName = driver.findElement(By.xpath(wkt_xpath)).getText();

		System.out.println(wTakerName);

		return wTakerName;

	}

}
