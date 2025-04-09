package ExceptionHandling;

public class UseCAseFinally {

	public static void main(String[] args) {

		try {

			// make connection with database
			// use username/password of DB
			// ip:port
			// hit sql query
			// get result
			// use result - an exception came up!! so connection is not closed.
			// close the DB connection

		} catch (Exception e) {

			e.printStackTrace();
			
		} finally {

			// close the DB connection

		}

	}

}
