package SeleniumSessions;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) {
		// xpath is not an attribute. It is the adress of the element in the DOM.
		// absolute xpath (not recomended) & relative/custom xpath

		// https://naveenautomationlabs.com/opencart/index.php?route=account/login

		// htmltag[@attributeName=''] eg: //input[@name='email'] -- single attribute::::

		// By emailId = By.xpath("//input[@name='email']'");

		// htmltag[@attribute1='value1' and @attribute1 ='value2'] eg:
		// //input[@name='email' and @placeholder='E-Mail Address'] -- mutiple
		// attribute::::
		// or operator is also allowed just like and
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		//By emailId = By.xpath("//input[@name='email' and @placeholder='E-Mail Address']");
		//System.out.println(emailId);

		// text() function @ is not required in the formulae. only attributes need@
		// htmltag[text()='']::::

		// h2[text()='Returning Customer']
		// a[text()='Register'] - 3 show up in ths case for this web app
		// https://naveenautomationlabs.com/opencart/index.php?route=account/login

		// text() function with attribute::::
		// htmltag[@attr='value' and text()='value']

		// a[text()='Wish List' and @class='list-group-item']
		// a[@class='list-group-item' and text()='Wish List']

		// htmltag[@attr1='value' and @attr2='value' and text()='value'] - AND & OR can
		// be used but usally AND is used to make the xpath unqiue ::::

		// contains()::::
		// htmltag[contains(@attr,'value')]

		// input[contains(@id,'email')]
		// input[contains(@id,'password')]

		// dynamic attribute - the attribute value changes example below::::
		// <input id ='firstname_123'>
		// <input id ='firstname_456'>
		// <input id ='firstname_65432'>

		// input[contains(@id,'firstname_')] - for above issue this xpath works::::

		// contains() with text()::::
		// htmltag[contains(text(), 'value')]

		// https://www.freshworks.com/ website
		// h1[contains(text(),'easy')]
		// a[contains(text(),'Cust')] - entire text need not be written
		// a[text()='Customers']

		// https://www.amazon.in/ - website
		// a[contains(text(),'Amazon')]

		// contains() with text() and contains() with attribute::::
		// htmltag[contains(@attribute,'value') and contains(text(),'value')]

		// a[contains(@class,'nav_a') and contains(text(),'About Us')]

		// contains() with text() and with attribute::::
		// htmltag[contains(@attribute,'value') and @attr='value']

		// a[contains(text(),'About') and @class='nav_a']

		// contains with attr1 and attr2::::
		// htmtag[contains(@att,'value') and @att ='value']

		// input[contains(@type,'text') and @id='twotabsearchtextbox']

		// start-with()::::
		// htmltag[start-with(@attr,'value')]

		// input[starts-with(@name,'field')]
		// a[starts-with(text(),'Fresh')] - Freshworks website

		// a[contains(@href,'nav_cs_help')] - Amazon website - href can be used with
		// contains example

		// ends-with() in xpath has been depcreated. Does not work anymore.

		// index::::::

		/* (//input[@class='form-control'])[1] - (cature the group)[indexno] */
		/* (//input[@class='form-control'])[position()=6] */
		
		/*  (//input[@class='form-control'])[last()] */    //no first() function
		/*  (//input[@class='form-control'])[last()-1] */
		
		//By Help = By.xpath("(//div[@class='navFooterVerticalRow navAccessibility']//a)[last()]");
		//System.out.println(Help);
		
		
		
		//driver.findElement(By.xpath("//input[$$$id='username']")).sendKeys("satish.periche@gmail.com"); //invalid selector exception when x path syntax is wrong 
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("satish.periche@gmail.com");
		
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("satish.periche@gmail.com");//InvalidSelectorException 
		//since only one class is allowed in by.classname.
		
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("satish.periche@gmail.com"); 
		//By.xpath compound classea are allowed unlike by.classname.
		
		
		//driver.findElement(By.className("login-email")).sendKeys("satish.periche@gmail.com");
		//driver.findElement(By.className("login-password")).sendKeys("Test123");
		
		//https://app.hubspot.com/login
		// child usage: //div[@class='private-form__input-wrapper']/child::input[@id='username']
		//parent usage //input[@id='username']/parent::div
		//grand parent use ancestor
		
		//backward traversing //input[@id='username']/../../../
		
		
		

	}

}
