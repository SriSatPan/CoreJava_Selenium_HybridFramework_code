package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+b); //30
		
		String x ="hello";
		String y ="Selenium";
		
		System.out.println(x+y);//helloSelenium
		System.out.println(a+y);//10Selenium
		
		System.out.println(a+b+x+y);//30helloSelenium
		
		System.out.println(x+y+a+b);//helloSelenium1020
		System.out.println(x+y+(a+b));//helloSelenium30
		
		System.out.println(a+b+x+y+a+b);//30helloSelenium1020
		
		System.out.println(a+b+x+y+(a+b));//30helloSelenium30
		
		double c = 12.33;
		double d = 23.44;
		
		System.out.println(x+y+c+d);//helloSelenium12.3323.44
		System.out.println(x+y+a+b+c+d);//helloSelenium102012.3323.44
		
		char g='m';
		char p='n';
		
		String l = "testing";
		String u = "automation";
		
		System.out.println(l+u);//testingautomation
		System.out.println(l+u+g+p);//testingautomationmn
		
		char t1 = 'a';//97
		char t2 = 'b';//98
		
		System.out.println(t1+t2);//195 - ascii value taken for this numeric type primitive data.
		
		char t3 ='z';//122
		
		System.out.println(t1+t2+t3);//317
		System.out.println(t3);//z
		
		
		System.out.println(t2-t1);//1
		
		System.out.println(a);//10
		System.out.println('a');//a
		
		System.out.println('a'+'b');//195 - Any mathematical operation considers ascii values
		
		System.out.println("a+b"); //a+b
		
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		System.out.println('$'+'b');//36+97=134
		
		
		System.out.println((byte)'a');//97
		
		int s1 = 100;
		int s2 = 200;
		System.out.println("the value of s1 is:"+s1);//the value of s1 is:100
		System.out.println("the value of s1 is :"+s2);//the value of s1 is :200
		
		System.out.println("the sum is :"+s1 + s2);//the sum is :100200
		
		System.out.println("the sum is :"+ (s1 + s2));//the sum is :300
				

	}

}
