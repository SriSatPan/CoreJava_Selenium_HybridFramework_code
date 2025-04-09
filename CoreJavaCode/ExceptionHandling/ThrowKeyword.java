package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
	//create your own exception
		
		try {
			
			throw new Exception("user is not found");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println("-------------------------");
		
		String data = null;
		if(data==null) {
			
			try {
				
				throw new Exception("Data not found exception");
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
			
			System.out.println("-------------------------");
			
			try {
				
				//System.out.println(data.length());
				
				}catch (NullPointerException e) {
					
					System.out.println("can not calculate lenght");
					
				}
			
			System.out.println("bye");
			
		}
		

	}


