package OOP_Abstract;

public abstract class Page {

	// cannot create the object of abstract class.
	// 0-100% abstraction is possible in abstract classes. However Interface generally has 100% abstraction ignoring the default and static method
    // after jdk1.8

	public abstract void tilte();

	public abstract void url();

	public Page() {// construcutor of abstract class is possbile. Main difference between interface and abstract class

		System.out.println("page const...");

	}

	public Page(int i) {
					

		System.out.println("one parm page const..."+i);

	}

	public void pageTimeLoadTimeout() {
		System.out.println("page time out---10secs");
	}

	public final void displayLogo() {
		System.out.println("display logo");
	}

	public static void footer() {
		System.out.println("page footer");
	}

}
