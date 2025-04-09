package javasessions;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>(20);//Increase Default Virtual Segments of 10 to 20.
		//VC=20, PC=0, Load Factor =20/2 =10
		ar.add(10);
		ArrayList<Integer> ar1 = new ArrayList<Integer>(5);//Decrease Default Virtual Segments of 10 to 5.
		//VC=5, PC=0, Load Factor =5/2 =2
		ar1.add(20);

		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		//vc=10, pc=0
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(500);
		
		System.out.println(numList.size());//5
		System.out.println(numList.get(3));//400
		
		numList.remove(3);//remove based on Index. Cannot remove based on the Array contents.
		System.out.println(numList.size());//4
		System.out.println(numList.get(3));//500
		
		numList.remove(0);
		System.out.println(numList.size());//3
		System.out.println(numList);//[200, 300, 500]
		
		
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Sat","Ish"));
		//add contents as a arraylist in Dynamic Array
		
		
		System.out.println("-----");
		System.out.println(empList.size());
		System.out.println(empList);
		
		System.out.println("-----");
		empList.add("ted");
		System.out.println(empList.size());
		System.out.println(empList);
		
		//adding an Item at desired Array Index
		
		empList.add(0,"Sat1");
		System.out.println("-----");
		System.out.println(empList.size());
		System.out.println(empList);
		
		//cannot use this to add items out of Index range due to coninous memory allocation.
		
		//can only add at Index 5 for the above array emplist.
		//empList.add(5,"Sat1"); //java.lang.IndexOutOfBoundsException: Index: 5, Size: 4 - IOB exception
		
		
		//using List creating an Array
		
		List<Integer> num = Arrays.asList(1,2,3,4,5);//String dataype only for .as List
		System.out.println(num.size());//5
		
		//List is an Inteface
		List<String> PagesList =Arrays.asList("LoginPage","HomePage");
		//PagesList.add("CartPage"); //java.lang.UnsupportedOperationException
		System.out.println(PagesList);
		
		ArrayList<Integer> nList = new ArrayList<Integer>();
		nList.add(100);
		nList.add(2000);
		nList.add(1001);
		nList.add(32);
		System.out.println("-----");
		System.out.println(nList);
		
		//Sorting a List when ArrayList(Dynamic Array) is used
		Collections.sort(nList);//[100, 2000, 1001, 32]
		System.out.println("-----");
		System.out.println(nList);//[32, 100, 1001, 2000]
		
		//priniting a sorted list in reverse
		Collections.reverse(nList);
		System.out.println("-----");
		System.out.println(nList);//[2000, 1001, 100, 32]
		

		//Sorting a List when Static Array is used
		System.out.println("-----");
		int test[]= {23,12,2,45,65};
		System.out.println(Arrays.toString(test));
		Arrays.sort(test);
		System.out.println("-----");
		System.out.println(Arrays.toString(test));
		
		//creating copies of array elements
		ArrayList<String> myList = new  ArrayList<String>(Collections.nCopies(5, "iphone"));
		System.out.println("-----");
		System.out.println(myList.size());
		System.out.println(myList);
		
		//cmd+shift+O for Import - shortcut
		
		
		
		
		
		
		
		
		
		
		

	}

}
