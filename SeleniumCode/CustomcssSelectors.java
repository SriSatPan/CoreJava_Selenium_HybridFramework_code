package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.By;

public class CustomcssSelectors {

	public static void main(String[] args) {
		
		//css selector
		//id--> #id
		
		//class --> .classname
		
		//https://app.hubspot.com/login
		// #username
		/*By email = By.cssSelector("//#username");
		System.out.println(email);
		
		// .login-email
		
		By email1 = By.cssSelector(".login-email");
		System.out.println(email1);*/
		

		//htmltag#id
		// input#username
		// button#loginBtn
		
		//htmltag.class
		// input.login-email
		// button.login-submit
		
		// button#loginBtn.login-submit
		// button.login-submit#loginBtn
		
		//mutiple classes
		//c1.c2.c3..cn
		// .form-control.private-form__control.login-password.m-bottom-3
		// .form-control.login-password - using only two claases - no sequence required.
		
		// input.form-control.login-password --htmltag and mutiple classes
		
		//c1.c2.c3..cn#id
		// .form-control.login-password#password
		
		//#idc1.c2.c3..cn
		// #password.form-control.login-password
		
		
		//htmltag#idc1.c2.c3..cn
		//input#password.form-control.login-password
		
		//other attributes:
		
		// htmltag[attribute='value']
		// input[type='submit']
		
		// htmltag[attribute1='value'][attribute2='value']
		// input[type='submit'][value='Login'] ---no OR concept in css. default is And.
		//input[@type='submit' and @value='Login'] -xpath
		
		// input[name='email'][type='text'][id='input-email'][class='form-control'] --id and class can be used without a # or . resp as well
		
		//htmltag[attri*=value] --- * represents contains
		// input[id*=email]
		// input[placeholder*='E-Mail']
		
		//htmltag[attri^=value] --- ^ represents starts with
		// input[placeholder^='E-Mail']
		
		//htmltag[attri$=value] --- $ represents ends with. xpath does not support ends with.
		// input[placeholder$='Address']
		
		//parent to child:
		
		//htmltag#id<space>htmltag - gives all direct and indirect htmltag after space in the first html tag
		// form#hs-login div
		
		//htmltag#id>htmltag - gives all direct htmltag after > in the first html tag
		// form#hs-login>div
		
		// xpath has / and // for the same <space> and >
		
		//https://orangehrm.com/en/30-day-free-trial
		// select[id*='Country']>option
		// select[id*='Country'] option
		// both show 233 because there are no indirect options tag
		
		//child to parent: not allowed in css
		//backwards traversing: not allowed in css
		
		//major disadvantage of css - web table traversing cannot be done using css like done using XPath
		// ancestor, preceding-sibling not avaible in css. css only allows forward traversing
		
		//following sibling: + is the special character to use
		// label[for='input-email']+input
		
		                        //xpath       vs       css
		
		//1. syntax              complex               simple
		//2. backward            yes                   no
		//3. text                yes                   no
		//4. sibilings           yes                   limited - only forward/following
		//5. webtable            yes                   limited
		//6. parent to child     yes                   yes
		//7. performance         good                  good     --- depends on the xpath and css used.  // xpath engine of the browsers were slower ealier but it is good now
		
		//index
		//Shadow Dom
		
		//SVG - Done- Seperate Class code.
		
		// by .css selector - classes should be joined by . - Xpath they can all be wirtten with space
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//comma in css
		// input#username,input#password,button#loginBtn,small#password-description
		
		List<WebElement> manFiledList = driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,small#password-description"));
		System.out.println(manFiledList.size());
		
		if (manFiledList.size()==4) {
			
			System.out.println("PASS");
			
		}
		
		//not in css - sudo classes
		
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-2
		
		//input.form-control.private-form__control:not(#password) points to element same as first css above
		//input.form-control.private-form__control:not(#username) points to element same as second css below
		
		
		//Relative Locators in css
		// https://www.aqi.in/dashboard/canada
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
