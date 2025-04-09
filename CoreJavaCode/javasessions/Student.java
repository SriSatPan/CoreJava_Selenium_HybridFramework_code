package javasessions;

public class Student {
	
	//WAF 
	//create a method - getStudentMarks
	//pass a parameter: studentName(String)
	//return the student marks(int)
	//methods cannot be nested
	
	public int getStudentMarks(String name) {
		
		int marks = -1;
		
		switch(name.toLowerCase()){//.equalsIgnorecase can also be used
		
		case "sat":
			marks = 80;
			System.out.println ("Student is: "+name+".");
			break;
			
		case "ish":
			
			marks = 40;
			System.out.println ("Student is: "+name+".");
			break;
			
		case "ted":
			
			marks = 100;
			System.out.println ("Student is: "+name+".");
			break;
			
		default:
			
			System.out.println ("Enter valid Student Name");
			break;
			
		}
		
	 
     return marks;	//only one return allowed per method
     
		
	}

	public static void main(String[] args) {
		
		Student obj = new Student();
		int marks = obj.getStudentMarks("Ted");
		System.out.println ("Student got: "+ marks +" marks.");
		System.out.println("-----------------------");
		
		int marks1 = obj.getStudentMarks("Sat");
		System.out.println ("Student got: "+ marks1 +" marks.");
		System.out.println("-----------------------");
		
		int marks2 = obj.getStudentMarks("Ish");
		System.out.println ("Student got: "+ marks2 +" marks.");
		System.out.println("-----------------------");
		
		int marks3 = obj.getStudentMarks("Panda");
		
		if(marks3<0) {
			System.out.println ("No Marks");
		}
		

	}

}
