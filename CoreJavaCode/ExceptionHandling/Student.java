package ExceptionHandling;

public class Student {

	public static int getMarks(String name) {

		System.out.println("Getting marks for: " + name);

		if (name.equals("ish")) {

			try {

				int i = 9 / 0;
				System.out.println(i);
				return 90;

			} catch (ArithmeticException e) {

				e.printStackTrace();
				//System.exit(1);//only with this finally will not run. JVM is sht down.
				return 80;

			}

			//return 40;
			/*finally {
				
				System.out.println("final Marks..");
				return 45;
			}*/

		} else if (name.equals("ted")) {

			return 100;

		} else if (name.equals("sat")) {

			return 60;

		} else {

			System.out.println("student not found..");
			throw new MyException("student not found..");
		}

	}

	public static void main(String[] args) {

		int m = getMarks("ish");
		System.out.println(m);

	}

}
