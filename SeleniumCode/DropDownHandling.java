package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	static WebDriver driver;

	public static void main(String[] args) {

		// When tag name of the drop down is Select only then below method works with
		// Will not work for this site https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
		// Select Class

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/en/30-day-free-trial");

		//WebElement countryDropDown = driver.findElement(By.id("Form_getForm_Country"));

		// Create an object of Select class

		/*Select sel = new Select(countryDropDown); // web element is complusory in the constructor call
		
		List<WebElement> countryOptions = sel.getOptions();
		System.out.println(countryOptions.size()-1);
		
		for(WebElement e:countryOptions)
		{
			String text = e.getText();
			System.out.println(text);
		}*/
		
		

		// sel.selectByIndex(5); this can be used when fixed/static droppdown like
		// month, week or days dropdowns.

		// sel.selectByVisibleText("India");

		//sel.selectByValue("Argentina");// this the text is the attribute text. It may not be aviable always.
										// https://gyazo.com/b6316cac042f7051d38ee25bf4e9387a

		//countryDropDown.sendKeys("India");// parmater is case sensitive.

		// select is always for a single Web Element
		
		By country = By.id("Form_getForm_Country");
		doSelectDropDownByIndex(country,15);
		doSelectDropDownByVisibleText(country, "India");
		doSelectDropDownByVisibleText(country, "Denmark");
		
		 ArrayList<String> ddOptionsList = getDropDownOptionsList(country);
		 System.out.println(ddOptionsList);
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static void doSelectDropDownByIndex(By locator, int value) {

		//WebElement ele = getElement(locator);
		Select select = new Select(getElement(locator));
		select.selectByIndex(value);

	}
	
	public static void doSelectDropDownByVisibleText(By locator, String value) {

		//WebElement ele = getElement(locator);
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);

	}
	
	public static void doSelectDropDownByValue(By locator, String value) {

		//WebElement ele = getElement(locator);
		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}
	
	public static List<WebElement> getDropDownOptions(By locator) {
		
		Select select = new Select(getElement(locator));
		return select.getOptions();
		
	}
	
	public static int getDropDownOptionsCount(By locator) {
		
		return getDropDownOptions(locator).size();
		
	}
	
	 public static ArrayList<String> getDropDownOptionsList(By locator){
		 
		 
		 //Select select = new Select(getElement(locator));
		 List<WebElement> dropDownOptionsList = getDropDownOptions(locator);
		 ArrayList<String> ddOptionsList = new ArrayList<String>();
		 
		 for(WebElement e:dropDownOptionsList )
			{
				String text = e.getText();
				ddOptionsList.add(text);
			}
		 
		 
		 return ddOptionsList;
	 }
	
	/*  
	 public ArrayList<String> getElementsTextList(By locator) {

		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();

		for (WebElement e : eleList) {

			String text = e.getText();

			if (text.length() != 0) {

				eleTextList.add(text);

			}

		}

		return eleTextList;

	}*/

}
