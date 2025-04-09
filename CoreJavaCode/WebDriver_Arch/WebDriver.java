package WebDriver_Arch;

//https://gyazo.com/14129f6108a046a6cb3b27d85e9bccb3

public interface WebDriver extends SearchContext{
	
	public void get(String url);
	
	public String getTitle();
	
	public void click(String element);
	
	public void sendKeys(String element, String Value);
	
	public void close();
	
	@Override
	public void findElement(String element);

}
