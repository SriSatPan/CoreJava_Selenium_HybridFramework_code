package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPopUp {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// JS Pop Up - Cannot inspect this like a web element
		// Alert pop Up
		// modal diloag pop up - JS/Alert pop up.

		// 1. Alert
		// 2. confirm
		// 3. prompt

		// https://the-internet.herokuapp.com/javascript_alerts

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		// JS pop Up is Displayed

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);

		Thread.sleep(3000);

		// alert.sendKeys(text); if it is a prompt type alert to enter info in the text
		// field

		// accept the alert:

		// alert.accept();
		alert.dismiss();

	}

}
