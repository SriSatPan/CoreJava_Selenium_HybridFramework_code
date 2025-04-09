package StringManipulation;

public class StringClass {

	public static void main(String[] args) {
		
		//string literals are created in String constant Pool
		String x ="123";// cannot do matemetical operations
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "hello";
		
		//memory map
		//https://gyazo.com/6386a33e1cfefc7d8e49f81a831f6815
		
		System.out.println(s==s1); //true
		System.out.println(s1==s2);//false
		System.out.println(x==s2); //false
		
		//String Objects with new keyword
		
		String st = new String("Java");
		String st1 = new String("Hello");
		
		//memroy map
		//https://gyazo.com/4ed6a58c43abe500b77d519aeb9fee2c
		
		
		System.out.println(st==st1);//false
		System.out.println(s==st1);//false  https://gyazo.com/6f5a2a411862b3afee9bf02c72b7b93c 
		// comparing the reference values of s and st1. hence false.
		
		System.out.println(s.equals(st1));//true excat values being compaed here.
		
		String st2 = new String("Hello");///always creates new object in heap. not optimal to use new with strings.
		// use string literals always to use memeory optimised managment in String constant pool.
		System.out.println(st2);
		
		String test = new String("Selenium");//1 new object created
		test.intern();//no reference value selenium is created in string constant pool - pool memeory. 
		//eligible for garabage collector
		// 1 more object created in SCP.
		
		//https://gyazo.com/9fdda05c69cf957cde24260d1057c18f
		
		String t1 = "Selenium"; //existing selenium will refer to t1 in pool memory //zero object is created
		System.out.println(t1.equals(test));//true
		
		String st4 = new String();
		System.out.println(st4.length());//0
		
		
		
		
		

	}

}
