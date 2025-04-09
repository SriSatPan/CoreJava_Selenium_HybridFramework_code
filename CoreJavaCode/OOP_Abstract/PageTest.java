package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);//parent class default constructor will always be called
		lp.tilte();
		lp.url();
		lp.displayLogo();
		lp.pageTimeLoadTimeout();
		lp.forgotPwd();
		Page.footer();//page footer
		LoginPage.footer();//page footer - login page || if no hidden method in LoginPage class then Page class footer method will be called.
		
		//Page p = new Page(); // Cannot create object of page class because it is abstract
		
		//child class object can be referred by parent abstract class ref variable
		
		System.out.println("------------");
		
		Page p  = new LoginPage();
		p.tilte();
		p.url();
		p.displayLogo();
		p.pageTimeLoadTimeout();
		//p.forgotPwd(); secuirty check - reference type check failure
		
		//down casting is possible at complie time only between claas to class with type cast but will still thrown an error at run time.
		//class to abstract class down casting is not possible even at complie time
		
		
		
		
	}

}
