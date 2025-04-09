package WebDriver_Arch;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		
		System.out.println("launch chrome browser");
		
	}


	@Override
	public void get(String url) {
		
		System.out.println("entering url: "+url);
		
	}

	@Override
	public String getTitle() {
		
		return "amazon";
	}

	@Override
	public void click(String element) {
		
		System.out.println("click on: "+element);
		
		
	}

	@Override
	public void sendKeys(String element, String Value) {
		
		System.out.println("entering "+Value+ "into " + element);
		
	}

	@Override
	public void close() {
		
		System.out.println("close browser");
		
	}

	@Override
	public void findElements(String elements) {
		
		System.out.println("finding elements by using: " + elements);
		
		
	}

	@Override
	public void findElement(String element) {
		
		System.out.println("finding element by using: " + element);
		
	}
	
	
	

}
