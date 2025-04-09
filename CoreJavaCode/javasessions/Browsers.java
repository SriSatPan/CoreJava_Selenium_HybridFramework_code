package javasessions;

public class Browsers {
	
	String name; //non static variable
	static String hq="vizag"; //static variable
	
	public int getBrowserVersion(){//non static method
		System.out.println("get browser version");
		return 100;
		
	}
	
	public static String getBrowserVendor(){//static method
		System.out.println("get browser vendor");
		return "Mozilla";
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Browsers  obj = new Browsers (); //memory allocation -> https://gyazo.com/b32bdbb13609cdee8fadc14d8a522161
		System.out.println(obj.name);//can access non-static variable only via the object created
		System.out.println(hq);//Static variables can be accessed directly but not a good practice
		System.out.println(Browsers.hq);//good practice to call with class name for static variables.
		
		obj.getBrowserVersion();//non-static access directly via the object
		
		
		getBrowserVendor(); //static method can be called directly.
		Browsers.getBrowserVendor();//good practice to call static method as well with class name
		
		obj.name="Satish";
		//obj.hq="hyd"; //no syntax error but a warning is thrown
		//obj.getBrowserVendor();//no syntax error but a warning is thrown
		
		
		//object cannot hold static properties (var,method)
		//static will be stored in CMA - Perm Gen - Metaspace (1.8).
		//Object can call/access static properties with a warning
		//Always call static with the class name
		//10 objects --> Static copies - 1
		//non-static copies = 10
		
		String x = Browsers.hq;
		System.out.println(x);
		
		//Prem Gen vs Metaspace  - 1.7 vs 1.8.main difference -> static memory vs Dynamic memory
	
	}
	

}
