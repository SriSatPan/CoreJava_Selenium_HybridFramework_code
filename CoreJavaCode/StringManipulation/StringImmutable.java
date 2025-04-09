package StringManipulation;

public class StringImmutable{//value of a string cannot be changed

	public static void main(String[] args) {
		
		String s = "Selenium";
		String t = s + "Hello";
		System.out.println(t);
		System.out.println(s);
		
		//memory map - https://gyazo.com/e0ae05bf8054abb6051fd6ce9af6d658
		
		String st = "Java";
		System.out.println(st+"Python");//always creates a new entry because string are immutable
		System.out.println(st);//value remains the same
		
		//memory map - https://gyazo.com/0bc516b7095df2d408bab9470e0c506c
		
		
		st = st +"Automation";//new entry created but reference of new entry chnages to st. "java" now has no reference
		System.out.println(st);
		
		String u ="Java"; //u now refrences exiting entry of "java"
		System.out.println(u);
		
		//string immutable is a slight disadvantage because every string manipulation - new entry has to be created
		//Therefore use mutable classes for string
		//Stringbuilder(1.5) and Stringbuffer(1.0)
		
		
		//mutable classes
		StringBuilder sb = new StringBuilder("Testing");
		sb.append("Automation");
		System.out.println(sb);//TestingAutomation no new entry here.
		
		String pop = "      submit          ";
		pop=pop.trim();
		System.out.println(pop);
		
		
		
	}

}
