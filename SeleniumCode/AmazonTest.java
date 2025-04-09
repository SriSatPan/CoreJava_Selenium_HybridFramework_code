package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) throws Exception {

		String browser = "firefox";

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser(browser);
		brUtil.launchUrl("http://amazon.com");
		
		String title = brUtil.getPageTitle();
		
		//CheckPoint
		
		if (title.contains("Amazon")){
			System.out.println ("corect title -- PASS");
		} else {
			System.out.println ("incorrect title -- FAIL");
		}
		
		brUtil.getPageUrl();
		brUtil.closeBrowser();

	}

}
