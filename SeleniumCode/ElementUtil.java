package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;
	private Select select;
	private Actions act;

	public ElementUtil(WebDriver driver) {

		this.driver = driver;
		act = new Actions(driver);

	}

	public void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);

	}

	public void doClick(By locator) {

		getElement(locator).click();

	}

	public String doGetText(By locator) {

		return getElement(locator).getText();

	}

	public String DoGetAttribute(By locator, String name) {

		return getElement(locator).getAttribute(name);

	}

	public boolean doElementIsDisplayed(By locator) {

		return getElement(locator).isDisplayed();

	}

	public boolean isSingleElementPresent(By locator) {

		List<WebElement> list = getElements(locator);
		System.out.println(list.size());

		if (list.size() == 1) {
			System.out.println("Single search ele is present on UI");
			return true;
		} else {
			System.out.println("No search/Mutiple search ele(s) are present on UI");
			return false;
		}
	}

	public WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public int getElementsCount(By locator) {

		return getElements(locator).size();

	}

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

	}

	// *****************Drop Down Utils*********************//

	public void doSelectDropDownByIndex(By locator, int value) {

		// WebElement ele = getElement(locator);
		select = new Select(getElement(locator));
		select.selectByIndex(value);

	}

	public void doSelectDropDownByVisibleText(By locator, String value) {

		// WebElement ele = getElement(locator);
		select = new Select(getElement(locator));
		select.selectByVisibleText(value);

	}

	public void doSelectDropDownByValue(By locator, String value) {

		// WebElement ele = getElement(locator);
		select = new Select(getElement(locator));
		select.selectByValue(value);

	}

	public List<WebElement> getDropDownOptions(By locator) {

		select = new Select(getElement(locator));
		return select.getOptions();

	}

	public int getDropDownOptionsCount(By locator) {

		return getDropDownOptions(locator).size();

	}

	public ArrayList<String> getDropDownOptionsList(By locator) {

		// select = new Select(getElement(locator));
		List<WebElement> dropDownOptionsList = getDropDownOptions(locator);
		ArrayList<String> ddOptionsList = new ArrayList<String>();

		for (WebElement e : dropDownOptionsList) {
			String text = e.getText();
			ddOptionsList.add(text);
		}

		return ddOptionsList;
	}

	public void doSelectValueFromDropDown(By locator, String Value) {

		List<WebElement> optionsList = getElements(locator);
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {

			String optionsListText = e.getText();
			System.out.println(optionsListText);

			if (optionsListText.equals(Value)) {

				e.click();
				break;// since it's inside a for loop. Break cannot be used in only if statement.

			}

		}

	}

	// *****************Drop Down Utils*********************//

	public void doSearch(By searchlocator, String searchkey, By searchsuggestion, String value)
			throws InterruptedException {

		driver.findElement(searchlocator).sendKeys(searchkey);
		Thread.sleep(3000);

		List<WebElement> SuggestedSearchList = driver.findElements(searchsuggestion);
		System.out.println(SuggestedSearchList.size() - 3);

		for (WebElement e : SuggestedSearchList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(value)) {
				e.click();
				break;
			}

		}

	}

	public void doSearch(String tagName, String text) {

		By suggLocator = By.xpath("//" + tagName + "[text()='" + text + " ']");
		driver.findElement(suggLocator).click();

	}

	public ArrayList<String> getFooterLinksList(By locator) {

		List<WebElement> footerList = driver.findElements(locator);
		System.out.println(footerList.size());

		ArrayList<String> eleTextList = new ArrayList<String>();

		for (WebElement e : footerList) {

			String text = e.getText();
			eleTextList.add(text);

		}

		return eleTextList;

	}

	public boolean checkElementIsMandatory(String jsScript) {

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

	// ********************ACTION UTILS********************************//

	public void handleLevel1MenuItems(By parentMenu, By childMenu) throws InterruptedException {

		act.moveToElement(getElement(parentMenu)).build().perform(); // mouse over action
		Thread.sleep(3000);
		doClick(childMenu);

	}

	public void doActionsClick(By locator) {

		act.click(getElement(locator)).build().perform();

	}

	public void doActionsSendkeys(By locator, String value) {

		act.sendKeys(getElement(locator), value).build().perform();

	}

	// *****************************Wait Utils******************************//

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForElementPresence(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public void doSendKeysWithWait(By locator, int timeOut, String value) {

		waitForElementPresence(locator, timeOut).sendKeys(value);

	}

	public void clickWithWait(By locator, int timeOut) {

		waitForElementPresence(locator, timeOut).click();

	}

	public String getElementTextWithWait(By locator, int timeOut) {

		return waitForElementPresence(locator, timeOut).getText();

	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * Default polling time = 500 millisecs.
	 * @param locator
	 * @param timeOut
	 * @return
	 */

	public WebElement waitForElementVisible(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * Default polling time = customized
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public WebElement waitForElementVisible(By locator, int timeOut, int pollingtime) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut),Duration.ofSeconds(pollingtime) );
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public void doSendKeysWithVisibleElement(By locator, int timeOut, String value) {

		waitForElementVisible(locator, timeOut).sendKeys(value);

	}

	public void clickWithVisibleElement(By locator, int timeOut) {

		waitForElementVisible(locator, timeOut).click();

	}

	public String getElementTextWithVisibleElement(By locator, int timeOut) {

		return waitForElementVisible(locator, timeOut).getText();

	}

	// *********************** JS Alert + Wait ***********************//

	public Alert waitforAlert(int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public String getAlertText(int timeOut) {

		return waitforAlert(timeOut).getText();

	}

	public void accpetAlert(int timeOut) {

		waitforAlert(timeOut).accept();

	}

	public void dismissAlert(int timeOut) {

		waitforAlert(timeOut).dismiss();

	}

	public void alertSendKeys(int timeOut, String value) {

		waitforAlert(timeOut).sendKeys(value);

	}

	public String waitForTitleContains(int timeout, String titleFraction) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {

			return driver.getTitle();

		} else {

			return null;
		}

	}

	public String waitForTitleIs(int timeout, String title) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		if (wait.until(ExpectedConditions.titleIs(title))) {

			return driver.getTitle();

		} else {

			return null;
		}

	}

	public String waitForUrContains(int timeout, String urlFraction) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		if (wait.until(ExpectedConditions.urlContains(urlFraction))) {

			return driver.getCurrentUrl();

		}

		else

			return null;
	}

	public String waitForUrIs(int timeout, String urlValue) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		if (wait.until(ExpectedConditions.urlToBe(urlValue))) {

			return driver.getCurrentUrl();

		}

		else

			return null;
	}

	public void waitForFrame(int timeOut, int frameIndex) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));

	}

	public void waitForFrame(int timeOut, String nameOrID) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrID));

	}

	public void waitForFrame(int timeOut, WebElement FrameElement) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameElement));

	}

	public void waitForFrame(int timeOut, By FrameLocator) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameLocator));

	}

}
