package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//FireFoxDriver driver = new FireFoxDriver();
		
		String browser= "firefox";
		WebDriver driver = null;
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FireFoxDriver();
		}
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("page title: "+title);
		driver.findElement("email id");
		driver.sendKeys("email id ", "satish.periche@gmail.com ");
		driver.findElement("loginButton");
		driver.click("loginButton");
		driver.close();
		
	

	}

}
