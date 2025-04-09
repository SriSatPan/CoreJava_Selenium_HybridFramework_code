package StringManipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s = "This is my Java Code in Test"; // 0-19 position of the array
		int len = s.length();
		System.out.println(len);// 20

		System.out.println(s.charAt(0));// T
		System.out.println(s.charAt(19));// e
		// System.out.println(s.charAt(20)); //java.lang.StringIndexOutOfBoundsException

		// System.out.println(s.charAt(-1)); //SIOBE

		System.out.println(s.indexOf('T'));// 0
		System.out.println(s.indexOf('e'));// 19
		System.out.println(s.indexOf('i'));// 2 - first avaiable of 'i' in array

		System.out.println(s.indexOf('i', 3));// 5 - second occurance of 'i' in array //hard coded index value

		System.out.println(s.indexOf('i', s.indexOf('i') + 1));// 5 - no hard coating of index value required

		int j = (s.indexOf('i') + 1);
		System.out.println(j);

		System.out.println(s.indexOf('i', (s.indexOf('i') + 1) + 3));// 21

		System.out.println(s.indexOf("Java"));// 11

		System.out.println(s.indexOf("Hello"));// -1 when specific value is not avaible then -1 is returned in index of
												// method

		String mesg = "welcome admin";

		if (mesg.indexOf("admin") == 8) {//PASS
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		
		String test = "       Hello world    ";
		System.out.println(test.trim());//removes spaces from the corners - Hello world
		
		
		System.out.println(test.trim().toUpperCase());//HELLO WORLD
		
		System.out.println(test.trim().toLowerCase());//hello world
		
		
		String dob ="15-12-1980";
		
		System.out.println(dob.replace('-','/')); //15/12/1980
		System.out.println(test.trim().replace(" ",""));//Helloworld - all spaces removed
		
		
		String st ="hello world";
		String st1 ="hello world";
		
		System.out.println(st.equals(st1));//true

		System.out.println(st.equalsIgnoreCase(st1));//true
		
		String p = "this is selenium testing";
		System.out.println(p.contains("selenium"));//true
		
		//split
		
		String lang = "JAVA_DOTNET_RUBY_PYTHON";
		String l[] =lang.split("_");
		
		System.out.println(l[0]);//Java
		System.out.println(l[1]);//DOTNET
		System.out.println(l[2]);//RUBY
		
		System.out.println(Arrays.toString(l)); //[JAVA, DOTNET, RUBY, PYTHON]
		
		
		
		
		
		
		
		

	}

}
