package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		// driver.findElement(By.name("email")).sendKeys("satish.periche@gmail.com");
		// driver.findElement(By.name("password")).sendKeys("PerSat4123");

		// driver.findElement(By.xpath("//div[text()='Login']")).click();
		// Thread.sleep(5000);

		// driver.findElement(By.xpath("//i[@class='users icon']")).click();
		// Thread.sleep(5000);

		// a[text()='Test 3 Test
		// 3']/parent::td/preceding-sibling::td//input[@type='checkbox']
		// moving backwards to main parent and between sibling backwards.
		// //following-sibling to move forward preceding-sibling to mve backwards

		//selectContact("John.Smith");
		Thread.sleep(2000);
		
		selectContact("Joe.Root");
		
		Thread.sleep(2000);
		
		getUserInfo("John.Smith");

	}

	public static void selectContact(String userName) {
		// a[text()='John.Smith']/parent::td/preceding-sibling::td//input[@type="checkbox"]
		String con_xpath = "//a[text()='" + userName + "']/parent::td/preceding-sibling::td//input[@type='checkbox']";
		driver.findElement(By.xpath(con_xpath)).click();

	}

	// check https://selectorshub.com/xpath-practice-page/ and write generic
	// function
	public static ArrayList<String> getUserInfo(String userName) {

		// a[text()='John.Smith']/parent::td/preceding-sibling::td/parent::tr
		List<WebElement> contList = driver.findElements(By
				.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/parent::tr"));
		ArrayList<String> contValues = new ArrayList<String>();
		for (WebElement e : contList) {

			String text = e.getText();
			System.out.println(text);
			contValues.add(text);

		}

		return contValues;

	}

}
