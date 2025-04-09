package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {

		// button[@type='submit']//*[local-name()='svg']

		// *[local-name()='svg' and @id ='map-svg']

		// *[local-name()='svg' and @id ='map-svg']//*[name()='g' and
		// @id='regions']//*[name()='g' and @class = 'region']
		// capture all id's to get the states

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");

		Thread.sleep(10000);
		
		driver.switchTo().frame(1);
		
		String map_xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g'and@class='region']";

		List<WebElement> regionsList = driver.findElements(By.xpath(map_xpath));

		System.out.println(regionsList.size());

		for (WebElement e : regionsList) {

			String idVal = e.getAttribute("id");
			System.out.println(idVal);

		}

	}

}
