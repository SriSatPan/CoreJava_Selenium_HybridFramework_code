package javasessions;

public class UserInt {
	
	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		
		UserInt u1= new UserInt();
		u1.name="Sat";
		u1.age=43;
		u1.city="vizag";
		
		
		UserInt u2= new UserInt();
		u2.name="Ish";
		u2.age=35;
		u2.city="Coorg";
		
		
		UserInt u3= new UserInt();
		u3.name="Ted";
		u3.age=8;
		u3.city="Godvari";
		
		System.out.println(u1.name +" "+u1.age+" "+u1.city);//Sat 43 vizag
		System.out.println(u2.name +" "+u2.age+" "+u2.city);//Ish 35 Coorg
		System.out.println(u3.name +" "+u3.age+"  "+u3.city);//Ted 8 Godvari
		
		u1=u2;//copies u2 details to u1 - The Object reference.
		System.out.println("-----");
		
		System.out.println(u1.name +" "+u1.age+" "+u1.city);//Ish 35 Coorg
		System.out.println(u2.name +" "+u2.age+" "+u2.city);//Ish 35 Coorg
		System.out.println(u3.name +" "+u3.age+"  "+u3.city);//Ted 8 Godvari
		
		u2=u3;
        System.out.println("-----");
		
		System.out.println(u1.name +" "+u1.age+" "+u1.city);//Ish 35 Coorg
		System.out.println(u2.name +" "+u2.age+"  "+u2.city);//Ted 8 Godvari
		System.out.println(u3.name +" "+u3.age+"  "+u3.city);//Ted 8 Godvari
		
		
		u3=u1;
        System.out.println("-----");
		
		System.out.println(u1.name +" "+u1.age+" "+u1.city);//Ish 35 Coorg
		System.out.println(u2.name +" "+u2.age+"  "+u2.city);//Ted 8 Godvari
		System.out.println(u3.name +" "+u3.age+"  "+u3.city);//Ish 35 Coorg
	}

}
