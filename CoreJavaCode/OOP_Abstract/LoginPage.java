package OOP_Abstract;

public class LoginPage extends Page{
	
	//hidden constructor is being created now and is called when clid class object is created
	//now page call constructor will be called..
	
	public LoginPage() {
		
		System.out.println("lp --- constructor...");
		
	}
	
    public LoginPage(int i) {
		
		System.out.println("lp --- constructor..."+i);
		
	}

	@Override
	public void tilte() {
		
		System.out.println("login title");
		
	}

	@Override
	public void url() {
		System.out.println("https://test.com");
		
	}
	
	@Override
	public void pageTimeLoadTimeout() {
		System.out.println("page time out---5secs");
	}
	
	
	public void forgotPwd() {
		System.out.println("forgot password");
		
	}
	
	//method hiding
	public static void footer() {
		System.out.println("page footer - login page");
	}
	

}
