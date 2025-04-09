package javasessions;

public class Car {
	
	String name;
	String color;
	int price;
	static final int wheels=4;//static propetry will not be given to object now. It's commmon for all objects.
	//https://gyazo.com/cf5e2ed341abd10fe833e3a30001dbdd. saves memory of static value.
	// https://gyazo.com/30f1bf5dfeb9e13b76fbcad8cd2813fd stored in CMA (common memory allocation). 
	//CMA also called ->Perm Gen -> metaspace (java 7.1)
	
	public static void main(String[] args) {
		
		Car c1 =new Car();
		c1.name="BMW";
		c1.color="White";
		c1.price=80;
		//c1.wheels=4;
		
		Car c2 =new Car();
		c2.name="Audi";
		c2.color="Red";
		c2.price=70;
		//c2.wheels=4;
		
		Car c3 =new Car();
		c3.name="Honda";
		c3.color="Black";
		c3.price=20;
		//c3.wheels=4;
		
		//wheels is the common attribute which is always the same. waste of memory to not make it static.
		
		//static variable access.
		//Car.wheels=5; //add final keyword to prevent this override
		
		System.out.println(c1.name+ " "+c1.color+ " " +c1.price+ " " +Car.wheels);//BMW White 80 4
		System.out.println(c2.name+ " "+c2.color+ " " +c2.price+ " " +Car.wheels);//Audi Red 70 4
		System.out.println(c3.name+ " "+c3.color+ " " +c3.price+ " " +Car.wheels);//Honda Black 20 4
		
		System.out.println(wheels);//4 - This is fine as well.
		
		//Use Case - Web page - common Propertys:
		//Logo, url of domain, search, footer
		
	}

}
