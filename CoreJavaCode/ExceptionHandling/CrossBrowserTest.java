package ExceptionHandling;

public class CrossBrowserTest {

	public static void main(String[] args) {

		String browser = "firefox";

		if (browser.equals("chrome")) {

			System.out.println("launch Chrome");

		} else if (browser.equals("safari")) {

			System.out.println("launch Safari");

		} else if (browser.equals("opera")) {

			System.out.println("launch Opera");

		} else {
			
			System.out.println("pls launch correct browser!");
			throw new MyException("browsernotfound");
		}

	}//throws is used to delegate the exception. throw is used to create custom exception

}
