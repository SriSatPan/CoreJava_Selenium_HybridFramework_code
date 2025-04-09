package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		
		int i=1;
		System.out.println(i);// runs once.
		
		//constant time: Big O(1)
		
		String name = "Sat";
		System.out.println(name); // O(1)
		
		
		int p=10;
		for(int n=1;n<=p;n++) {
			System.out.println(n);
		}//1+n+n+n -> 3n+1 
		// 3n+1 ignoring the constant part -> O(3n) -> O(n) for a for loop. n is no of loop execution times.

	
		//1 to 100 - while loop
		
		short j=1;
		short n = 100;
		short q=0;
		while (j<=n) {
			
			System.out.println("Hi");
			System.out.println(j);
			System.out.println(q);
			q++;
			j++; //1+1+n+n+n+n+n+n -> 6n+2 -> 2(3n+1) ->2(3n) -> 6n -> O(n) --Liner
			// Time Complexity Graph -> https://gyazo.com/d5b7a9b4b7064ebbcba57c7356aaf65d
			System.out.println();
		}
		
		//nested loops
		
		for(i=0;i<=99;i++) {
			for(j=0;j<=99;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();	
		}//(1+n+n+n)(1+n+n+n) -> (1+3n)(1+3n) -> 1+3n+3n+6n^2 -> 9n^2+6n+1 -- Quadratic
		 //9n^2+6n -> 3(3n^2+2n) -> n^2+n -> n(n+1) -> n^2 -> O(n^2).
		 //Time Complexity Graph -> https://gyazo.com/472bcf3b36273417f485878ca2f35a13
		
		// 3 nested loops will be a cubic equation -- O(n^3)
		//-- O(n^2)  and --O(n^3) is very expensive on response time
		//https://gyazo.com/8550835ca56abde1d0fc682226a6b44a
		
		
		//O(log n) - Binary Search
		// n/2 n/4 n/8 /n16
		//32-->16-->8-->4-->2-->1
		// k=n/2
		//log (k) = log(n/2)
		// log K = log n + log 2
		//log k = log n +1 ---> O(log n)
		
		//graph https://gyazo.com/17a26b0bb6fbda5c27c27d05992165bb
		
		byte b1=100;
		byte b2 = 90;
		
		
		byte b3 = (byte)(b1+b2);
		System.out.println(b3);
		
		// ; an end of loop terminates in immediately
		
		byte t1 = 065; //Octal no - every digit is within 0-7.
		System.out.println(t1); //octal to decimal conversion - 53.
		
		
	}

}
