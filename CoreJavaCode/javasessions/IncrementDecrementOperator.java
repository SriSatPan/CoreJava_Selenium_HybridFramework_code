package javasessions;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//++ and  --
		// increase and decrease of the variable value by 1.
		
		byte a =1;
		byte b= a++;//post increment
		
		System.out.println(a);//2
		System.out.println(b);//1
		
		byte l=3;
		byte m=l++;
		
		System.out.println(l);//4
		System.out.println(m);//3
		
		byte p = -98;
		byte q = p++;
		
		System.out.println(p);//-97
		System.out.println(q);//-98
		
		byte u = 1;
		byte y = ++u;//pre increment
		
		System.out.println(u);//2
		System.out.println(y);//2
		
		byte x=5;
		byte z=++x;
		
		System.out.println(x);//6
		System.out.println(z);//6
		
		byte v = -99;
		byte vv = ++v;
		
		System.out.println(v);//-98
		System.out.println(vv);//-98
		
		byte pop =2;
		System.out.println(pop++);//2
		System.out.println(pop);//3
		
		byte loop = 2;
		System.out.println(++loop);//3
		System.out.println(loop);//3
		
		byte amt = 10;
		int famt  = amt + 4;
		System.out.println(famt);//14
		
		byte tt=2;
		byte pp= tt--; //post decrement
		
		System.out.println(tt);//1
		System.out.println(pp);//2
		
		short rest = -99;
		short api = rest--;
		
		System.out.println(rest);//-100
		System.out.println(api);//-99
		
		byte aa =2;
		byte bb= --aa; //pre decrement
		
		System.out.println(aa);//1
		System.out.println(bb);//1
		
		short s1 = -1000;
		short s2 = --s1;
		
		System.out.println(s1);//-1001
		System.out.println(s2);//-1001
		
		int s3 = 40;
		System.out.println(s3--);//40
		System.out.println(s3);//39
		
		int p3 = 50;
		System.out.println(--p3);//49
		System.out.println(p3);//49
		System.out.println(p3+1);//50
		
		byte sat = 1;
		int test = sat++ + sat++ + sat++ + sat++; //1+2+3+4
		
		System.out.println(test);//10
		System.out.println(sat);//5
		System.out.println(test++);//10
		System.out.println(++test);//12
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
